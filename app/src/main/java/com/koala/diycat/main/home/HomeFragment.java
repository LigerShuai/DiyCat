package com.koala.diycat.main.home;

import android.annotation.SuppressLint;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;

import com.koala.diycat.api.ApiService;
import com.koala.diycat.base.BaseRefreshFragment;
import com.koala.diycat.main.adapter.HomeAdapter;
import com.koala.diycat.model.statuses.TimeLine;
import com.koala.diycat.network.NetManager;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * @author Liger
 * @date 2018/4/29 00:48
 */
public class HomeFragment extends BaseRefreshFragment {

    private List<String> mDatas;
    private HomeAdapter mAdapter;

    @Override
    protected void initView() {
        super.initView();
        mDatas = new ArrayList<>();
        mAdapter = new HomeAdapter(mDatas);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(mContext));
        mRecyclerView.setAdapter(mAdapter);
    }

    @SuppressLint("CheckResult")
    @Override
    protected void initData() {

        NetManager.getInstance().retrofit().create(ApiService.class).getPublicTimeLine()
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
                        for (int i = 0; i < timeLine.getStatuses().size(); i++) {
                            mDatas.add(timeLine.getStatuses().get(i).getUser().getName());
                        }
                        mAdapter.notifyDataSetChanged();
                        Log.d("liger", "onNext: ");
                    }

                    /**
                     * 发送请求失败调用该方法
                     * @param e
                     */
                    @Override
                    public void onError(Throwable e) {
                        Log.d("liger", "onError: 请求失败" + e.getMessage());
                    }

                    @Override
                    public void onComplete() {
                        Log.d("liger", "onComplete: 请求成功");
                    }
                });
    }

}
