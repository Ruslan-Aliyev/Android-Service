package com.android.serv.serv1.service;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

/**
 * Created by FG000030 on 2016/7/20.
 */
public class Service1 extends IntentService {

    private static final String TAG = "1111111111";

    @Override
    protected void onHandleIntent(Intent arg0) {
        Log.i(TAG, "Intent Service started");
    }

    public Service1() {
        super("Service1");
    }
}