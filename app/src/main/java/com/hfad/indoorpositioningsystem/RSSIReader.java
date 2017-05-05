package com.hfad.indoorpositioningsystem;

import android.content.Context;
import android.net.wifi.WifiManager;

/**
 * Created by salma on 05/05/17.
 */
public class RSSIReader {
    static Context mContext;
    public RSSIReader(Context context){
        this.mContext = context;
    }
    public RSSIReader(){
        
    }
    public int readRSSI(){
        WifiManager wifi= (WifiManager) mContext.getSystemService(Context.WIFI_SERVICE);

        //mHandler.sendEmptyMessage(MSG_GET_RSSI);
        if (wifi.getConnectionInfo().getBSSID() != null) {
            return wifi.getConnectionInfo().getRssi();


        } else {
            //   Log.v(LOG_TAG, "Not connected to wifi, skipping...");
            return -1;
            //textView.setText("Not connected to wifi, skipping...");
        }
    }

}
