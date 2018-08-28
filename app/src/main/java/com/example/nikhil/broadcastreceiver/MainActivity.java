package com.example.nikhil.broadcastreceiver;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.btn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                broadcastIntent();
            }
        });

    }

    //Broadcast custom intent

    public void broadcastIntent()
    {
        Intent intent = new Intent();

        intent.setAction("com.nikhil.test_intent");

        sendBroadcast(intent);
    }



}
