package com.koala.diycat.utils;

/**
 * @author Liger
 * @date 2018/8/23 21:31
 */

import java.io.Closeable;
import java.io.IOException;

public class BaseUtil {

    /**
     * 关闭 IO 流
     *
     * @param closeables
     */
    public static void closeIO(Closeable... closeables) {
        for (Closeable closeable : closeables) {
            if (closeable == null) {
                return;
            }
            try {
                closeable.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}

