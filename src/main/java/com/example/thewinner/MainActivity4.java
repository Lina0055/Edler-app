package com.example.thewinner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }

    public void Question2(View view) {
        RadioButton radio1 = findViewById(R.id.rb1);
        RadioButton radio2 = findViewById(R.id.rb2);
        RadioButton radio3 = findViewById(R.id.rb3);
        RadioButton radio4 = findViewById(R.id.rb4);
        if (radio3.isChecked()) {
            Intent intent1 = new Intent(MainActivity4.this, MainActivity8.class);
            startActivity(intent1);
        } else {
            Intent intent2 = new Intent(MainActivity4.this, MainActivity7.class);
            startActivity(intent2);


        }
    }
}
