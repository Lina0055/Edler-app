package com.example.thewinner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void btnGame1(View view) {
        Intent intent = new Intent(MainActivity2.this,MainActivity3.class);
        startActivity(intent);

    }
    public void btnGame2(View view) {
        Intent intent = new Intent(MainActivity2.this,MainActivity4.class);
        startActivity(intent);

    }
    public void btnGame3(View view) {
        Intent intent = new Intent(MainActivity2.this,MainActivity5.class);
        startActivity(intent);

    }
    public void btnGame4(View view) {
        Intent intent = new Intent(MainActivity2.this,MainActivity6.class);
        startActivity(intent);

    }
}