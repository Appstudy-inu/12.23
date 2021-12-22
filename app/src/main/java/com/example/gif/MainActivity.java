package com.example.gif;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {
    private ImageView GIF;
    private ImageView GIF1;
    private ImageView GIF2;
    private Button move0to1;
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
        move0to1=findViewById(R.id.move0to1);
        move0to1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this,SubActivity.class);
                startActivity(intent);
            }
        });

    }
}