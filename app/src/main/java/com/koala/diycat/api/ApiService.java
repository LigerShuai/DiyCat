package com.koala.diycat.api;

import com.koala.diycat.model.TestData;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * api接口
 *
 * @author Liger
 * @date 2018/5/1 16:43
 */
public interface ApiService {

    /**
     * 获取主页数据
     *
     * @return
     */
    @GET("tabs/selected")
    Call<TestData> getHomePage();

}
