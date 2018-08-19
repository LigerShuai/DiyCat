package com.koala.diycat.network;

import com.orhanobut.logger.Logger;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/**
 * OkHttp3 的监听
 *
 * @author Liger
 * @date 2018/5/24 00:45
 */
public class LogInterceptor implements Interceptor {

    @Override
    public okhttp3.Response intercept(Chain chain) throws IOException {
       /* Request request = chain.request();
        //输出请求前整个url
        Log.e("shuai", "okhttp3:" + request.toString());
        okhttp3.Response response = chain.proceed(chain.request());

        okhttp3.MediaType mediaType = response.body().contentType();
        String content = response.body().string();
        //输出返回信息
        Log.e("shuai", "response body:" + content);
        return response.newBuilder()
                .body(okhttp3.ResponseBody.create(mediaType, content))
                .build();*/

        //这个chain里面包含了request和response，所以你要什么都可以从这里拿
        Request request = chain.request();

        long t1 = System.nanoTime();
//        Logger.i(String.format("发送请求 %AuthActivity on %AuthActivity%n%AuthActivity",
//                request.url(), chain.connection(), request.headers()));

        Response response = chain.proceed(request);

        long t2 = System.nanoTime();

        //这里不能直接使用response.body().string()的方式输出日志
        //因为response.body().string()之后，response中的流会被关闭，程序会报错，我们需要创建出一
        //个新的response给应用层处理
        ResponseBody responseBody = response.peekBody(1024 * 1024);
        Logger.i(response.request().url() + responseBody.string());
        return response;
    }
}