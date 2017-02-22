package com.duff.steamplus.utilx;


import java.io.Closeable;
import java.io.IOException;

/**
 * 主要实现io.close()
 * Created by ezez-c
 */
public class IOUtilx {
    public static boolean close(Closeable io) {
        if (null != io) {
            try {
                io.close();
            } catch (IOException e) {
                LogUtilx.e(e);
            }
        }
        return true;
    }
}
