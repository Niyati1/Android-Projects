package com.example.niyati.nchat;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.p2p.WifiP2pDevice;
import android.net.wifi.p2p.WifiP2pDeviceList;
import android.net.wifi.p2p.WifiP2pManager;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Niyati on 4/21/2017.
 */


class WiFiDirectBroadCastReceiver extends BroadcastReceiver {

    private WifiP2pManager mManager;
    private WifiP2pManager.Channel mChannel;
    private WifiActivityMain mActivity;

    WifiP2pManager.PeerListListener myPeerListListener;

    List<WifiP2pDevice> devicelist  = new ArrayList<WifiP2pDevice>();
    List<String> d = new ArrayList<>();

    public WiFiDirectBroadCastReceiver(WifiP2pManager manager, WifiP2pManager.Channel channel,
                                       WifiActivityMain activity) {
        super();
        this.mManager = manager;
        this.mChannel = channel;
        this.mActivity = activity;
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();

        if (WifiP2pManager.WIFI_P2P_STATE_CHANGED_ACTION.equals(action)) {
            // Check to see if Wi-Fi is enabled and notify appropriate activity

            int state = intent.getIntExtra(WifiP2pManager.EXTRA_WIFI_STATE, -1);
            if (state == WifiP2pManager.WIFI_P2P_STATE_ENABLED) {
                mActivity.setEnabled(true);
            } else {
                // Wi-Fi P2P is not enabled

                mActivity.setEnabled(false);
            }
        } else if (WifiP2pManager.WIFI_P2P_PEERS_CHANGED_ACTION.equals(action)) {
            // Call WifiP2pManager.requestPeers() to get a list of current peers

            if(mManager!=null){
                mManager.requestPeers(mChannel, new WifiP2pManager.PeerListListener() {
                    @Override
                    public void onPeersAvailable(WifiP2pDeviceList peers) {
                        devicelist.clear();
                        d.clear();
                        devicelist.addAll(peers.getDeviceList());
                        System.out.println(devicelist.size());
                        if(devicelist.size()!=0) {
                            for (WifiP2pDevice device : devicelist) {
                                d.add(device.deviceName+"\n"+device.deviceAddress);
                            }
                            mActivity.setList(d);
                        }

                    }
                });
            }
        } else if (WifiP2pManager.WIFI_P2P_CONNECTION_CHANGED_ACTION.equals(action)) {
            // Respond to new connection or disconnections
        } else if (WifiP2pManager.WIFI_P2P_THIS_DEVICE_CHANGED_ACTION.equals(action)) {
            // Respond to this device's wifi state changing
        }
    }
}

