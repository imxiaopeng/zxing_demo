package com.cxp.zxing.activity;

import android.app.Application;
import android.content.Context;

/**
 * Created by Administrator on 2017/2/16.
 */

public class MyApplication extends Application {
    public static Context context=null;
    @Override
    public void onCreate() {
        super.onCreate();
        context=this;
    }

}
