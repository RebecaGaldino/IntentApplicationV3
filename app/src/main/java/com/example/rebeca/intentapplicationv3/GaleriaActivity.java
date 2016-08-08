package com.example.rebeca.intentapplicationv3;

import android.content.Intent;
import android.drm.DrmStore;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Gallery;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.rebeca.intentapplicationv3.R;

import java.net.URI;

public class GaleriaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galeria);
        getIntent();
    }

    public void TelaCheia6(View view) {

        ImageView img6 = (ImageView) findViewById(R.id.imageView6);
        img6.setImageResource(R.mipmap.foto6);
    /*
        img6.setScaleType(ImageView.ScaleType.FIT_XY);
        img6.setLayoutParams(new Gallery.LayoutParams(150,120));
        img6.setBackgroundColor(Color.BLACK);
    */

    }


}








