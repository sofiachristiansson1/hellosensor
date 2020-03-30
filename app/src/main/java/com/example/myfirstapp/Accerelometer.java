package com.example.myfirstapp;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Accerelometer extends AppCompatActivity implements SensorEventListener {

    private SensorManager mSensorManager;
    private Sensor mAccelerometer;
    private TextView accX, accY, accZ, lutning;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accerelometer);

        accX=findViewById(R.id.accX);
        accY=findViewById(R.id.accY);
        accZ=findViewById(R.id.accZ);
        lutning=findViewById(R.id.textView5);


        mSensorManager = (SensorManager)getSystemService(SENSOR_SERVICE);
        mAccelerometer = mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        mSensorManager.registerListener(this, mAccelerometer, SensorManager.SENSOR_DELAY_UI);
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        if (event.sensor.getType() == Sensor.TYPE_ACCELEROMETER) {
            accX.setText(String.valueOf(event.values[0]));
            accY.setText(String.valueOf(event.values[1]));
            accZ.setText(String.valueOf(event.values[2]));
        }
        if (event.values[0] < 0 ){
            lutning.setText("LUTNING: höger");
        } else {
            lutning.setText("LUTNING: vänster");
        }

    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
}
