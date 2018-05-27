package com.koala.diycat.api;

import com.koala.diycat.model.statuses.TimeLine;

import io.reactivex.Observable;
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
    @GET("statuses/public_timeline.json")
    Observable<TimeLine> getPublicTimeLine();

}
