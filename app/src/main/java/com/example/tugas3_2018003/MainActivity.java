package com.example.tugas3_2018003;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void rajaampat(View view) {
        Intent a = new Intent(MainActivity.this,
                rajaampat.class);
        startActivity(a);
    }
}