package com.android.serv.serv1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.android.serv.serv1.service.Service1;
import com.android.serv.serv1.service.Service2;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent servInt1 = new Intent(this, Service1.class);
        startService(servInt1);
    }

    public void serviceTwo(View view) {
        Intent servInt2 = new Intent(this, Service2.class);
        startService(servInt2);
    }
}
