package com.koala.diycat.main.home;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.koala.diycat.R;
import com.koala.diycat.base.BaseActivity;
import com.koala.diycat.main.adapter.ViewPagerAdapter;
import com.koala.diycat.widget.ControllableViewPager;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * @author Liger
 * @date 2018/4/26 上午1:00
 * 主页
 */

public class MainActivity extends BaseActivity implements TabLayout.OnTabSelectedListener {

    @BindView(R.id.activity_main_vp)
    ControllableViewPager mViewPager;
    @BindView(R.id.activity_main_tl)
    TabLayout mTabLayout;

    private ViewPagerAdapter mAdapter;
    private int[] mTitles;
    private int[] mTabIcons;

    @Override
    protected void initView() {
        mTitles = new int[]{R.string.home, R.string.dynamic, R.string.discovery, R.string.mine};
        mTabIcons = new int[]{R.drawable.home_tab_iv_selector, R.drawable.dynamic_tab_iv_selector,
                R.drawable.discovery_tab_iv_selector, R.drawable.mine_tab_iv_selector};

        List<Fragment> fragments = new ArrayList<>();
        fragments.add(new HomeFragment());
        fragments.add(new DynamicFragment());
        fragments.add(new DiscoveryFragment());
        fragments.add(new MineFragment());
        mAdapter = new ViewPagerAdapter(getSupportFragmentManager(), fragments);
        mViewPager.setScrollable(true);
        mViewPager.setAdapter(mAdapter);
        mTabLayout.setupWithViewPager(mViewPager);
        setupTabView(mTabLayout);
        mTabLayout.addOnTabSelectedListener(this);
    }

    @Override
    protected void initData() {

    }

    @Override
    protected int getContentViewId() {
        return R.layout.activity_main;
    }

    private void setupTabView(TabLayout tabLayout) {
        for (int i = 0; i < mAdapter.getCount(); i++) {
            tabLayout.getTabAt(i).setCustomView(getTabView(i));
        }
    }

    private View getTabView(int position) {
        View view = LayoutInflater.from(this).inflate(R.layout.tab_layout_item, null);
        TabViewHolder viewHolder = new TabViewHolder(view);
        viewHolder.tabIv.setImageResource(mTabIcons[position]);
        viewHolder.tabTv.setText(getString(mTitles[position]));
        return view;
    }

    @Override
    public void onTabSelected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }

    class TabViewHolder {

        @BindView(R.id.view_tab_iv)
        ImageView tabIv;
        @BindView(R.id.view_tab_tv)
        TextView tabTv;

        TabViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
