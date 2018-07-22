package edu.csulb.android.arttherapy;

import android.content.Context;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends ActionBarActivity implements SensorEventListener {
    private SensorManager mSensorManager;
    private  long lastUpdate;
    private Customview customCanvas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        customCanvas = (Customview) findViewById(R.id.customview);


        mSensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);

        mSensorManager.registerListener(this,
                mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER),
                SensorManager.SENSOR_DELAY_NORMAL);
        lastUpdate = System.currentTimeMillis();
    }



    protected void OnResume() {
        super.onResume();
        mSensorManager.registerListener(this,
                mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER),
                SensorManager.SENSOR_DELAY_NORMAL);

    }

    @Override
    protected void onPause() {


        super.onPause();
        mSensorManager.unregisterListener(this);
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        long now = System.currentTimeMillis();

        if(event.sensor.getType()== Sensor.TYPE_ACCELEROMETER){
            checkShake(event);
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {


    }


    public void clearCanvas(View v) {

        customCanvas.clearCanvas();

    }

    private void checkShake(SensorEvent event) {
        float x =event.values[0];
        float y = event.values[1];
        float z = event.values[2];

        float acc = (x * x + y*y+ z*z)/(SensorManager.GRAVITY_EARTH * SensorManager.GRAVITY_EARTH);
        long actualTime = System.currentTimeMillis();
        if(acc>=3){
            if(actualTime - lastUpdate < 200){
                return;
            }
            lastUpdate = actualTime;
            clearCanvas(customCanvas);
            Intent intent = new Intent(this,Eraser.class);
            startService(intent);




        }
    }

}
