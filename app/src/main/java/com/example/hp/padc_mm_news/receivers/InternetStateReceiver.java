package com.example.hp.padc_mm_news.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.widget.Toast;

/**
 * Created by HP on 11/25/2017.
 */

public class InternetStateReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
        if (networkInfo.isConnected())
        {
            Toast.makeText(context, "Online", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(context, "Offline", Toast.LENGTH_SHORT).show();
        }
    }
}
