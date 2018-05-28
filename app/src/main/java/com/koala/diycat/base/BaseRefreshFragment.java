package com.koala.diycat.base;

import android.support.annotation.CallSuper;
import android.support.v7.widget.RecyclerView;

import com.koala.diycat.R;
import com.scwang.smartrefresh.header.DropboxHeader;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnLoadMoreListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;

import butterknife.BindView;

/**
 * @author Liger
 * @date 2018/4/30 01:39
 * <p>
 * 下拉刷新基类.
 */
public abstract class BaseRefreshFragment extends BaseFragment implements OnRefreshListener, OnLoadMoreListener {

    @BindView(R.id.fragment_base_refresh_rv)
    protected RecyclerView mRecyclerView;
    @BindView(R.id.refreshLayout)
    protected SmartRefreshLayout mRefreshLayout;

    @CallSuper
    @Override
    protected void initView() {
        mRefreshLayout.setRefreshHeader(new DropboxHeader(mContext)).setPrimaryColorsId(R.color.tab_tv_color_pressed);
        mRefreshLayout.setOnRefreshListener(this);
        mRefreshLayout.setOnLoadMoreListener(this);
    }


    @Override
    protected int getContentViewId() {
        return R.layout.fragment_base_refresh;
    }


    @Override
    public void onRefresh(RefreshLayout refreshLayout) {
        mRefreshLayout.finishRefresh(2000);
    }

    @Override
    public void onLoadMore(RefreshLayout refreshLayout) {
        mRefreshLayout.finishLoadMore(2000);
    }
}
