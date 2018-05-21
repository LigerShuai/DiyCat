package com.koala.diycat.main.adapter;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.koala.diycat.R;
import com.koala.diycat.model.TestData;

import java.util.List;

/**
 * @author Liger
 * @date 2018/4/30 18:28
 */
public class HomeAdapter extends BaseQuickAdapter<TestData, BaseViewHolder> {

    public HomeAdapter(@Nullable List<TestData> data) {
        super(R.layout.fragment_home_rv_item, data);

    }

    @Override
    protected void convert(BaseViewHolder helper, TestData item) {
        helper.setText(R.id.tv_fragment_home_rv_item, item.getMsg());
    }

}
