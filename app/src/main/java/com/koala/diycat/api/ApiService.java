package com.koala.diycat.api;

import com.koala.diycat.model.PublicTimeLine;

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
    @GET("statuses/public_timeline.json?access_token=2.00a84ggCeURfzC13e87045d2ilFJiD")
    Call<PublicTimeLine> getHomePage();


}
