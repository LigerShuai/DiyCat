package com.koala.diycat.network;

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

//        Log.d("liger", "intercept: " + AccessTokenKeeper.readAccessToken(BaseApp.getContext()).getToken());
        String token = "2.00a84ggCeURfzC13e87045d2ilFJiD";
        HttpUrl url = originalHttpUrl.newBuilder()
//                .addQueryParameter("access_token", AccessTokenKeeper.readAccessToken(BaseApp.getContext()).getToken())
                .addQueryParameter("access_token", token)
                .build();
        Request request = originalRequest.newBuilder()
                .url(url)
                .method(originalRequest.method(), originalRequest.body())
                .build();

        return chain.proceed(request);
    }
}
