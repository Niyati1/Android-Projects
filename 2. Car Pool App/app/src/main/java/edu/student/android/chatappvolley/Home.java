package edu.student.android.chatappvolley;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.location.LocationManager;
import android.os.Bundle;
import android.provider.Settings;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.toolbox.StringRequest;

import edu.student.android.chatappvolley.features.OwnACarpool;
import edu.student.android.chatappvolley.features.RequestACarpool;
import edu.student.android.chatappvolley.features.ViewRequestRides;
import edu.student.android.chatappvolley.features.ViewYourCarpool;

/**
 * Created by Gaurav on 31-03-2017.
 */

public class Home extends AppCompatActivity {
TextView chat,updateProfile,own,view,request,myrequestrides;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        LocationManager lm = (LocationManager)getApplicationContext().getSystemService(Context.LOCATION_SERVICE);
        boolean gps_enabled = false;
        boolean network_enabled = false;
        try {
            gps_enabled = lm.isProviderEnabled(LocationManager.GPS_PROVIDER);
        } catch(Exception ex) {}

        try {
            network_enabled = lm.isProviderEnabled(LocationManager.NETWORK_PROVIDER);
        } catch(Exception ex) {}
        if(!gps_enabled && !network_enabled) {
            // notify user
            AlertDialog.Builder dialog = new AlertDialog.Builder(this);
            dialog.setMessage("Enable Network/Location");
            dialog.setPositiveButton("Open Location Settings", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface paramDialogInterface, int paramInt) {
                    // TODO Auto-generated method stub
                    Intent myIntent = new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
                    startActivity(myIntent);
                    //get gps
                }
            });
            dialog.setNegativeButton("Close", new DialogInterface.OnClickListener() {

                @Override
                public void onClick(DialogInterface paramDialogInterface, int paramInt) {
                    // TODO Auto-generated method stub

                }
            });
            dialog.show();
        }

            //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        /*chat = (TextView) findViewById(R.id.chat);
        updateProfile = (TextView) findViewById(R.id.updateprofile);*/
        own = (TextView)  findViewById(R.id.ownacarpool);
        view = (TextView) findViewById(R.id.viewcarpool);
        request=(TextView) findViewById(R.id.requestacarpool);
        myrequestrides = (TextView) findViewById(R.id.myrequestedrides);
        /*chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this,Users.class));
            }
        });
        updateProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Home.this,ViewProfile.class);
                i.putExtra("status","0");
                startActivity(i);
            }
        });*/
        own.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this, OwnACarpool.class));
            }
        });
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this, ViewYourCarpool.class));
            }
        });
        request.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this, RequestACarpool.class));
            }
        });
        myrequestrides.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this,ViewRequestRides.class));
            }
        });

        //new kClosestLocations();
       /* String url = ""
        StringRequest request = new StringRequest(Request.Method.GET,)*/

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.


        getMenuInflater().inflate(R.menu.menu_list, menu);


        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.view_profile) {


            Intent i = new Intent(Home.this,ViewProfile.class);
            i.putExtra("status","0");
            startActivity(i);


        }


        if (id == R.id.chat_with_existing_user) {
            Intent intent_chat_with_existing_user = new Intent(Home.this, Users.class);
            startActivity(intent_chat_with_existing_user);
        }

        return super.onOptionsItemSelected(item);
    }
}
