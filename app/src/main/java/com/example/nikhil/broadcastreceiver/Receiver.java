package com.example.nikhil.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by NIKHIL on 28-08-2018.
 */

public class Receiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        Toast.makeText(context,"Intent Detected",Toast.LENGTH_LONG).show();


    }
}
