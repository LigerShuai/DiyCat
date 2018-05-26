package com.koala.diycat.network;


import com.koala.diycat.api.Uri;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * 网络请求管理类
 *
 * @author Liger
 * @date 2018/5/24 00:43
 */
public class NetManager {

    private static final String BASE_URL = Uri.BASE_URL;

    private NetManager() {
    }

    private static class NetManagerHolder {
        private static NetManager instance = new NetManager();
    }

    public static NetManager getInstance() {
        return NetManagerHolder.instance;
    }


    /**
     * 初始化 OkHttp3
     */
    private OkHttpClient getClient() {
        return new OkHttpClient.Builder()
                .addInterceptor(new LogInterceptor())
//            .cache(new Cache(new File("C://okhttp"), 10 * 1024 * 102))
                .retryOnConnectionFailure(true)
                .connectTimeout(3, TimeUnit.SECONDS)
                .writeTimeout(5, TimeUnit.SECONDS)
                .readTimeout(5, TimeUnit.SECONDS)
                .build();
    }

    public Retrofit retrofit() {
        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(getClient())
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
    }

}
