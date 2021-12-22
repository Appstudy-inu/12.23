package com.example.gif;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SubActivity2 extends AppCompatActivity {
    private Button move2to1;
    private Button move2to3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub2);
        move2to1=findViewById(R.id.move2to1);
        move2to1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent = new Intent(SubActivity2.this,SubActivity.class);
                startActivity(intent);
            }
        });
        move2to3=findViewById(R.id.move2to3);
        move2to3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent = new Intent(SubActivity2.this,SubActivity3.class);
                startActivity(intent);
            }
        });
    }
}