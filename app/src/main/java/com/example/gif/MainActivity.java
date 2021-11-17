package com.example.gif;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {
    private ImageView GIF;
    private ImageView GIF1;
    private ImageView GIF2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GIF = findViewById(R.id.GIF);
        GIF1 = findViewById(R.id.GIF1);
        GIF2 = findViewById(R.id.GIF2);
        Glide.with(this).load(R.drawable._gif).into(GIF);
        Glide.with(this).load(R.drawable._gif2).into(GIF1);
        Glide.with(this).load(R.drawable._gif2).into(GIF2);

    }
}