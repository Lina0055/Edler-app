package com.example.thewinner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.RadioButton;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void Question1(View view) {
        RadioButton radio1 = findViewById(R.id.rb1);
        RadioButton radio2 = findViewById(R.id.rb2);
        RadioButton radio3 = findViewById(R.id.rb3);
        RadioButton radio4 = findViewById(R.id.rb4);
        if (radio1.isChecked()) {
            Intent intent1 = new Intent(MainActivity3.this, MainActivity8.class);
            startActivity(intent1);
        }
    else{
                Intent intent2 = new Intent(MainActivity3.this, MainActivity7.class);
                startActivity(intent2);


            }


        }
    }
