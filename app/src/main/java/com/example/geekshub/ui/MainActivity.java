package com.example.geekshub.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.geekshub.R;
import com.google.firebase.FirebaseApp;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FirebaseApp.initializeApp(this);

    }
}
