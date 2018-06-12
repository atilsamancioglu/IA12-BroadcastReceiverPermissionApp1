package com.atilsamancioglu.broadcastreceiverpermissionapp1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class BroadcastingClass extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Signal from App 2", Toast.LENGTH_LONG).show();
    }
}
