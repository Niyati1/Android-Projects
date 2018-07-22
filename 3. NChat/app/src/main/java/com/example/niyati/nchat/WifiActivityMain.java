package com.example.niyati.nchat;

import android.app.Activity;


/**
 * Created by Niyati on 4/21/2017.
 */

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.net.wifi.p2p.WifiP2pConfig;
import android.net.wifi.p2p.WifiP2pDevice;
import android.net.wifi.p2p.WifiP2pInfo;
import android.net.wifi.p2p.WifiP2pManager;
import android.os.AsyncTask;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;

import static android.view.LayoutInflater.*;

public class WifiActivityMain extends AppCompatActivity {
    public static final String TAG = "wifidirectdemo";
    private WifiP2pInfo device_address;
    protected static final int CHOOSE_FILE_RESULT_CODE = 20;
    WifiP2pManager mManager;
    WifiP2pManager.Channel mChannel;
    BroadcastReceiver mReceiver;
    private View mContentView = null;
    WifiP2pConfig config = new WifiP2pConfig();

    IntentFilter mIntentFilter;

    Button search;
    ListView list;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wifiactivity_main);

        mContentView = findViewById (R.id.activity_main);

        mManager = (WifiP2pManager) getSystemService(Context.WIFI_P2P_SERVICE);
        mChannel = mManager.initialize(this, getMainLooper(), null);
        mReceiver = new WiFiDirectBroadCastReceiver(mManager, mChannel, this);
        mIntentFilter = new IntentFilter();
        mIntentFilter.addAction(WifiP2pManager.WIFI_P2P_STATE_CHANGED_ACTION);
        mIntentFilter.addAction(WifiP2pManager.WIFI_P2P_PEERS_CHANGED_ACTION);
        mIntentFilter.addAction(WifiP2pManager.WIFI_P2P_CONNECTION_CHANGED_ACTION);
        mIntentFilter.addAction(WifiP2pManager.WIFI_P2P_THIS_DEVICE_CHANGED_ACTION);

        search =(Button)findViewById(R.id.search);

        list = (ListView) findViewById(R.id.list);

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                resetData();
                mManager.discoverPeers(mChannel, new WifiP2pManager.ActionListener() {
                    @Override
                    public void onSuccess() {


                        Toast.makeText(getApplicationContext(), "Searching for devices",Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onFailure(int reason) {
                        Toast.makeText(getApplicationContext(), "Searching failed",Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                final String value = (String) parent.getItemAtPosition(position);
                String addr[] = value.split("\\n");
                String address = addr[1];
                config.deviceAddress = address;
                //device_address =address;
                mManager.connect(mChannel, config, new WifiP2pManager.ActionListener() {
                    @Override
                    public void onSuccess() {
                        registerForContextMenu(list);
                        Toast.makeText(getApplicationContext(),"Connected to : " + value,Toast.LENGTH_SHORT).show();

                    }

                    @Override
                    public void onFailure(int reason) {
                        Toast.makeText(getApplicationContext(),"Connection failed",Toast.LENGTH_SHORT).show();
                    }
                });
                //
                // Toast.makeText(getApplicationContext(),address,Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void setEnabled(boolean isEnabled){
        if(isEnabled){
            Toast.makeText(this,"Wifi P2P is enabled",Toast.LENGTH_SHORT).show();

        }
        else
        {
            Toast.makeText(this,"Wifi P2P is not enabled",Toast.LENGTH_SHORT).show();
        }
    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.actions , menu);
    }

    @Override
    protected void onResume() {
        super.onResume();
        registerReceiver(mReceiver, mIntentFilter);
    }
    /* unregister the broadcast receiver */
    @Override
    protected void onPause() {
        super.onPause();
        unregisterReceiver(mReceiver);
    }

    public void setList(List devicelist){
        ArrayAdapter<String> devices =new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,devicelist);
        list.setAdapter(devices);
    }

    public void resetData(){
        list.setAdapter(null);
    }

    public boolean onContextItemSelected(MenuItem item) {

        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();

        switch(item.getItemId()){
            case R.id.images:
                Intent intent = new Intent(this,WiFiDirectActivity.class);
               // intent.setType("image/*");
               // startActivityForResult(intent,CHOOSE_FILE_RESULT_CODE);
                startActivity(intent);
                break;

        }
        return true;
    }

}


