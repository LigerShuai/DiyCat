package com.koala.diycat.main.home;

import android.support.v7.widget.LinearLayoutManager;

import com.koala.diycat.base.BaseRefreshFragment;
import com.koala.diycat.main.adapter.HomeAdapter;
import com.koala.diycat.model.test.HomeData;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Liger
 * @date 2018/4/29 00:48
 */
public class HomeFragment extends BaseRefreshFragment {

    @Override
    protected void initView() {
        super.initView();
        HomeAdapter adapter = new HomeAdapter(getData());
        mRecyclerView.setLayoutManager(new LinearLayoutManager(mContext));
        mRecyclerView.setAdapter(adapter);
    }

    @Override
    protected void initListener() {

    }

    @Override
    protected void initData() {

    }

    private List<HomeData> getData() {
        List<HomeData> list = new ArrayList<>();
        HomeData data;
        for (int i = 0; i < 20; i++) {
            data = new HomeData();
            data.setMsg("shuai" + i);
            list.add(data);
        }
        return list;
    }

}
