package com.koala.diycat.main.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.koala.diycat.R;
import com.koala.diycat.model.statuses.Status;
import com.koala.diycat.utils.glide.GlideApp;
import com.koala.diycat.utils.glide.GlideRoundTransform;
import com.orhanobut.logger.Logger;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * @author Liger
 * @date 2018/5/29 23:12
 */
public class DynamicAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context mContext;
    private List<Status> mList;

    private static final int TYPE_NORMAL = 1;
    private static final int TYPE_END = 2;


    public DynamicAdapter(Context context, List<Status> list) {
        super();
        mContext = context;
        mList = list;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType == TYPE_NORMAL) {
            View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.fragment_home_rv_item_timeline, parent, false);
            return new MyViewHolder(view);
        } else if (viewType == TYPE_END) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_end, parent, false);
            return new EndHolder(view);
        }
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof MyViewHolder) {
            MyViewHolder myViewHolder = (MyViewHolder) holder;
            Status status = mList.get(position);
            myViewHolder.userNameTv.setText(status.getUser().getName());
            myViewHolder.createTimeTv.setText("20小时前");
//            holder.createTimeTv.setText(status.getCreatedAt());
//            holder.sourceTv.setText(status.getSource());
            myViewHolder.contentTv.setText(status.getText());

            GlideApp.with(mContext)
                    .load(status.getUser().getProfile_image_url())
                    .centerCrop()
                    .transform(new GlideRoundTransform(25))
                    .listener(new RequestListener<Drawable>() {
                        @Override
                        public boolean onLoadFailed(@Nullable GlideException e, Object model, Target<Drawable> target, boolean isFirstResource) {
                            return false;
                        }

                        @Override
                        public boolean onResourceReady(Drawable resource, Object model, Target<Drawable> target, DataSource dataSource, boolean isFirstResource) {
                            return false;
                        }
                    })
                    .into(myViewHolder.userIv);
        } else if (holder instanceof EndHolder) {
            Logger.d("onBindViewHolder: EndHolder");
        }
    }

    @Override
    public int getItemCount() {
        return mList == null ? 0 : mList.size() + 1;
    }

    @Override
    public int getItemViewType(int position) {
        Logger.d("getItemViewType: position = " + position);
        if (position == mList.size()) {
            Logger.d("getItemViewType: TYPE_END = " + TYPE_END);
            return TYPE_END;
        } else {
            Logger.d("getItemViewType: TYPE_NORMAL = " + TYPE_NORMAL);
            return TYPE_NORMAL;
        }
    }

    static class MyViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.timeline_head_iv)
        ImageView userIv;
        @BindView(R.id.timeline_head_name_tv)
        TextView userNameTv;
        @BindView(R.id.timeline_head_time_tv)
        TextView createTimeTv;
        @BindView(R.id.timeline_head_source_tv)
        TextView sourceTv;

        @BindView(R.id.item_timeline_content_tv)
        TextView contentTv;

        MyViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

    class EndHolder extends RecyclerView.ViewHolder {

        EndHolder(View itemView) {
            super(itemView);
        }
    }
}
