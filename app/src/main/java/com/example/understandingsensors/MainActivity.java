
package com.example.understandingsensors;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.util.Log;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    final String TAG = "Sensors";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SensorManager managerObj = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        List<Sensor> sensorList = managerObj.getSensorList(Sensor.TYPE_ALL);
        Log.i(TAG, sensorList.toString());
        // use   Gyro sensor
        Sensor gyrosensor = managerObj.getDefaultSensor(Sensor.TYPE_ALL
        );
        //check if sensor is available
        if (gyrosensor != null)
            //    sensor  AVAILABLE}
            Log.i(TAG, "gyrosensor is available");//

    }
}
