package com.koala.diycat.api;

import com.koala.diycat.model.statuses.TimeLine;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

/**
 * api接口
 *
 * @author Liger
 * @date 2018/5/1 16:43
 */
public interface ApiService {

    /**
     * 获取公共时间线
     *
     * @param options 请求参数
     * @return
     */
    @GET("statuses/public_timeline.json")
    Observable<TimeLine> getPublicTimeLine(@QueryMap Map<String, Integer> options);

    /**
     * 获取我的时间线
     *
     * @param options 请求参数
     * @return
     */
    @GET("statuses/home_timeline.json")
    Observable<TimeLine> getHomeTimeLine(@QueryMap Map<String, Integer> options);
}
