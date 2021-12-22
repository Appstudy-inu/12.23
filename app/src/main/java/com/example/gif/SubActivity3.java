package com.example.gif;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SubActivity3 extends AppCompatActivity {
    private Button move3to2;
    private Button move3to0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub3);
        move3to2=findViewById(R.id.move3to2);
        move3to2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent = new Intent(SubActivity3.this,SubActivity2.class);
                startActivity(intent);
            }
        });
        move3to0=findViewById(R.id.move3to0);
        move3to0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent = new Intent(SubActivity3.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}