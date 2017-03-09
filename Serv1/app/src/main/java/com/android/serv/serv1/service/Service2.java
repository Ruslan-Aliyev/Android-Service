package com.android.serv.serv1.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

/**
 * Created by FG000030 on 2016/7/20.
 */
public class Service2 extends Service {

    public Service2() {
    }

    private static final String TAG = "2222222222";

    @Override
    public void onCreate() {
        Log.i(TAG, "Service onCreate");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        Log.i(TAG, "Service onStartCommand " + startId);

        final int currentId = startId;

        Runnable r = new Runnable() {
            public void run() {

                for (int i = 0; i < 3; i++) {
                    long endTime = System.currentTimeMillis() + 10*1000;

                    while (System.currentTimeMillis() < endTime) {
                        synchronized (this) {
                            try {
                                wait(endTime - System.currentTimeMillis());
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    }
                    Log.i(TAG, "Service running " + currentId);
                }
                stopSelf();
            }
        };

        Thread t = new Thread(r);
        t.start();
        return Service.START_STICKY;
    }

    @Override
    public IBinder onBind(Intent arg0) {
        Log.i(TAG, "Service onBind");
        return null;
    }

    @Override
    public void onDestroy() {
        Log.i(TAG, "Service onDestroy");
    }
}

