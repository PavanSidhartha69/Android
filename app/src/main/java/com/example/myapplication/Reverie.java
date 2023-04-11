package com.example.myapplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class Reverie extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i("Reverie", "hii");
        if(Intent.ACTION_BATTERY_LOW.equals(intent.getAction())){
            Toast.makeText(context, "LOWWWW", Toast.LENGTH_SHORT).show();
        }
        if (Intent.ACTION_AIRPLANE_MODE_CHANGED.equals(intent.getAction())) {
            Toast.makeText(context, "Hello", Toast.LENGTH_SHORT).show();
        }
        if (Intent.ACTION_CALL.equals(intent.getAction())){
            Toast.makeText(context, "Calll", Toast.LENGTH_SHORT).show();
        }

    }
}
