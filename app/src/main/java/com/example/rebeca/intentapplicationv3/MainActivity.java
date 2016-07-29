package com.example.rebeca.intentapplicationv3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirOpcoes (View v){
        Intent intent = new Intent(this, OpcoesActivity.class);
        startActivity(intent);
    }


    public void abrirGaleria (View v){
        Intent intent = new Intent(this, GaleriaActivity.class);
        startActivity(intent);
    }



}
