package com.example.rebeca.intentapplicationv2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.rebeca.intentapplicationv3.R;

public class GaleriaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galeria);
        getIntent();
    }
}
