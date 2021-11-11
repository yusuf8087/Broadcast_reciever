package com.example.broadcast_reciever;

import androidx.appcompat.app.AppCompatActivity;

import android.content.IntentFilter;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        IntentFilter intentFilter = new IntentFilter("com.example.broadcast_sender");
        MyBroadcastReceiver objReciever = new MyBroadcastReceiver();
        registerReceiver(objReciever,intentFilter);
    }
}