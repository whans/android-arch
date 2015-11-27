package com.whans.arch;

import android.app.Application;
import android.content.Context;

import com.squareup.leakcanary.LeakCanary;
import com.squareup.leakcanary.RefWatcher;

/**
 * @author whans
 * @date 11/27/15
 */
public class ArchApplication extends Application {
    private RefWatcher refWatcher;

    @Override
    public void onCreate() {
        super.onCreate();
        refWatcher = installLeakCanary();
    }

    public static RefWatcher getRefWatcher(Context context) {
        ArchApplication application = (ArchApplication) context.getApplicationContext();
        return application.refWatcher;
    }

    protected RefWatcher installLeakCanary() {
        if (BuildConfig.DEBUG) {
            return RefWatcher.DISABLED;
        } else {
            // this should be watch all activity
            return LeakCanary.install(this);
        }

    }
}
