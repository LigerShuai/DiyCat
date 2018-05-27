package com.koala.diycat.base;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;

import butterknife.ButterKnife;

/**
 * @author Liger
 * @date 2018/4/28 22:23
 *
 * Activity 基类
 */
public abstract class BaseActivity extends AppCompatActivity {

    protected View mRootView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mRootView = LayoutInflater.from(this).inflate(getContentViewId(), null);
        setContentView(mRootView);
        ButterKnife.bind(this);
        initView();
        initData();
    }

    /**
     * 初始化视图
     */
    protected abstract void initView();

    /**
     * 初始化数据
     */
    protected abstract void initData();

    /**
     * 返回布局id
     *
     * @return id
     */
    @LayoutRes
    protected abstract int getContentViewId();

    @Override
    protected void onDestroy() {
        super.onDestroy();

    }

}
