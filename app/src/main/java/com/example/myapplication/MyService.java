package com.example.myapplication;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.provider.Settings;

public class MyService extends Service {
    MediaPlayer mp;

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        mp =MediaPlayer.create(this, Settings.System.DEFAULT_NOTIFICATION_URI);
        mp.setLooping(true);
        mp.start();
        return START_STICKY;
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        return null;
        //throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onDestroy() {
        mp.stop();
        super.onDestroy();
    }
}