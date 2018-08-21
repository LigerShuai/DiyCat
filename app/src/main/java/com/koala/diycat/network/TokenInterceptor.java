package com.koala.diycat.network;

import com.koala.diycat.base.BaseApp;
import com.orhanobut.logger.Logger;
import com.sina.weibo.sdk.auth.AccessTokenKeeper;

import java.io.IOException;

import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * 给每个请求添加 url 参数,统一处理 Token
 *
 * @author Liger
 * @date 2018/5/27 14:08
 */
public class TokenInterceptor implements Interceptor {

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request originalRequest = chain.request();
        HttpUrl originalHttpUrl = originalRequest.url();

        HttpUrl url = originalHttpUrl.newBuilder()
                .addQueryParameter("access_token", AccessTokenKeeper.readAccessToken(BaseApp.getContext()).getToken())
                .build();
        Request request = originalRequest.newBuilder()
                .url(url)
                .method(originalRequest.method(), originalRequest.body())
                .build();

        Logger.d("intercept: " + AccessTokenKeeper.readAccessToken(BaseApp.getContext()).getToken());
        return chain.proceed(request);
    }
}
