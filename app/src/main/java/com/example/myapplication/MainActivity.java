package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button bt,bt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt = findViewById(R.id.button);
        bt2 = findViewById(R.id.button2);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OpenServiceAct();
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OpenServiceAct2();
            }
        });
    }
    public void OpenServiceAct(){
        Intent intent = new Intent (this,serviceActivity2.class);
        startActivity(intent);
    }
    public void OpenServiceAct2(){
        Intent intent = new Intent (this, Activity2.class);
        startActivity(intent);
    }
}