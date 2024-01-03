package com.example.thewinner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Switch;

public class MainActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
    }

    public void Question4 (View view) {
        CheckBox check4 = findViewById(R.id.C4);
        CheckBox check5 = findViewById(R.id.C5);
        CheckBox check8 = findViewById(R.id.C8);
        CheckBox check9 = findViewById(R.id.C9);
        CheckBox check3 = findViewById(R.id.C3);
        CheckBox check6 = findViewById(R.id.C6);
        Boolean c4 = check4.isChecked();
        Boolean c8 = check8.isChecked();
        Boolean c6 = check6.isChecked();

        if (c6 && c4 && c8) {
            Intent intent1 = new Intent(MainActivity6.this, MainActivity8.class);
            startActivity(intent1);
        }
            else{
                Intent intent2 = new Intent(MainActivity6.this, MainActivity7.class);
                startActivity(intent2);


            }
    }

    }
