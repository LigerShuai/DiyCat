package com.koala.diycat.main.adapter;

import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.widget.ImageView;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.koala.diycat.R;
import com.koala.diycat.model.statuses.Status;
import com.koala.diycat.utils.TimeHelper;
import com.koala.diycat.utils.glide.GlideApp;
import com.koala.diycat.utils.glide.GlideRoundTransform;

import java.util.List;

/**
 * @author Liger
 * @date 2018/4/30 18:28
 */
public class HomeAdapter extends BaseQuickAdapter<Status, BaseViewHolder> {

    public HomeAdapter(@Nullable List<Status> data) {
        super(R.layout.fragment_home_rv_item_timeline, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, Status item) {
        helper.setText(R.id.timeline_head_name_tv, item.getUser().getName());
        helper.setText(R.id.timeline_head_time_tv, TimeHelper.getCreateTime(item.getCreatedAt()));
//        helper.setText(R.id.timeline_head_source_tv, item.getSource());
        helper.setText(R.id.item_timeline_content_tv, item.getText());

        GlideApp.with(mContext)
                .load(item.getUser().getAvatarSmallUrl())
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
                .into((ImageView) helper.getView(R.id.timeline_head_iv));

    }

}
