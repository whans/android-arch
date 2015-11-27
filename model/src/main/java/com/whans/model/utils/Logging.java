package com.whans.model.utils;

import com.whans.model.BuildConfig;
import com.orhanobut.logger.LogLevel;
import com.orhanobut.logger.Logger;

/**
 * @author whans
 * @date 11/27/15
 */
public class Logging {
    private final static String LOG_TAG = "Arch";

    public static void initialLogging() {
        if (BuildConfig.DEBUG) {
            Logger.init(LOG_TAG).setLogLevel(LogLevel.FULL).setMethodOffset(1).setMethodCount(1).hideThreadInfo();
        } else {
            Logger.init().setLogLevel(LogLevel.NONE);
        }
    }

    public static void d(String message) {
        Logger.d(message);
    }

    public static void e(String message) {
        Logger.d(message);
    }

    public static void w(String message) {
        Logger.d(message);
    }

    public static void v(String message) {
        Logger.d(message);
    }

    public static void i(String message) {
        Logger.d(message);
    }

    public static void json(String json) {
        Logger.d(json);
    }
}
