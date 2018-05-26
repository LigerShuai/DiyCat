package com.koala.diycat.main.home;

import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;

import com.koala.diycat.api.ApiService;
import com.koala.diycat.base.BaseRefreshFragment;
import com.koala.diycat.main.adapter.HomeAdapter;
import com.koala.diycat.model.PublicTimeLine;
import com.koala.diycat.model.TestData;
import com.koala.diycat.network.NetManager;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

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
        NetManager.getInstance().retrofit().create(ApiService.class).getHomePage()
        .enqueue(new Callback<PublicTimeLine>() {
            @Override
            public void onResponse(Call<PublicTimeLine> call, Response<PublicTimeLine> response) {
                Log.d("liger", "onResponse: " + response);
            }

            @Override
            public void onFailure(Call<PublicTimeLine> call, Throwable t) {
                Log.d("liger", "onFailure: ");
            }
        });
    }

    private List<TestData> getData() {
        List<TestData> list = new ArrayList<>();
        TestData data;
        for (int i = 0; i < 20; i++) {
            data = new TestData();
            data.setMsg("shuai" + i);
            list.add(data);
        }
        return list;
    }

}
