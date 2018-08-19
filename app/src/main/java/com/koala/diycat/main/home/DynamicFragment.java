package com.koala.diycat.main.home;

import android.annotation.SuppressLint;
import android.support.v7.widget.LinearLayoutManager;

import com.koala.diycat.api.ApiService;
import com.koala.diycat.api.Uri;
import com.koala.diycat.base.BaseRefreshFragment;
import com.koala.diycat.main.adapter.DynamicAdapter;
import com.koala.diycat.model.statuses.Status;
import com.koala.diycat.model.statuses.TimeLine;
import com.koala.diycat.network.NetManager;
import com.orhanobut.logger.Logger;
import com.scwang.smartrefresh.layout.api.RefreshLayout;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * @author Liger
 * @date 2018/4/29 00:48
 */
public class DynamicFragment extends BaseRefreshFragment {

    private List<Status> mDatas;
    private DynamicAdapter mAdapter;
    private int page = 1;
    Map<String, Integer> options;

    @Override
    protected void initView() {
        super.initView();
        mDatas = new ArrayList<>();
        mRecyclerView.setLayoutManager(new LinearLayoutManager(mContext));
        mAdapter = new DynamicAdapter(mContext,mDatas);
        mRecyclerView.setAdapter(mAdapter);
    }

    @SuppressLint("CheckResult")
    @Override
    protected void initData() {
        getHomeTimeLine(page);
    }

    private void getHomeTimeLine(int pageCount) {
        options = new HashMap<>(1);
        options.put(Uri.PAGE, pageCount);
        NetManager.getInstance().retrofit().create(ApiService.class).getHomeTimeLine(options)
                //在 io 线程请求网络
                .subscribeOn(Schedulers.io())
                //回到主线程处理请求结果
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<TimeLine>() {
                    private Disposable mDisposable;

                    /**
                     * 发送请求后调用该方法
                     * @param d
                     */
                    @Override
                    public void onSubscribe(Disposable d) {
                        mDisposable = d;
                    }

                    /**
                     * 发送请求成功后,调用 onNext(),onComplete()方法
                     * @param timeLine
                     */
                    @Override
                    public void onNext(TimeLine timeLine) {
                        List<Status> statuses = timeLine.getStatuses();
                        if (statuses == null || statuses.size() <= 0) {
                            return;
                        }
                        if (page == 1) {
                            mDatas.clear();
                            mDatas.addAll(timeLine.getStatuses());
                            mAdapter.notifyDataSetChanged();
                        } else {
                            List<Status> list = new ArrayList<>(timeLine.getStatuses());
                            int position = mDatas.size();
                            mDatas.addAll(position, list);
                            mAdapter.notifyItemInserted(position);
                        }
                        page++;
                    }

                    /**
                     * 发送请求失败调用该方法
                     * @param e
                     */
                    @Override
                    public void onError(Throwable e) {
                        Logger.d("请求失败" + e.getMessage());
                    }

                    @Override
                    public void onComplete() {
                        Logger.d("请求成功");
                    }
                });
    }

    @Override
    public void onRefresh(RefreshLayout refreshLayout) {
        super.onRefresh(refreshLayout);
        page = 1;
//        getHomeTimeLine(page);
    }

    @Override
    public void onLoadMore(RefreshLayout refreshLayout) {
        super.onLoadMore(refreshLayout);
//        getHomeTimeLine(page);
    }

}
