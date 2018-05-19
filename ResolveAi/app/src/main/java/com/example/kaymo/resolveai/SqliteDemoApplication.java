package com.example.kaymo.resolveai;

import android.app.Application;

import com.orm.SugarContext;

/**
 * Created by kaymo on 19/05/2018.
 */

public class SqliteDemoApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        SugarContext.init(this);
    }
}
