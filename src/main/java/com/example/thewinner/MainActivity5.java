package com.example.thewinner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
    }
    public void Question3(View view){
        EditText answer=findViewById(R.id.edt);
        Double ans= Double.parseDouble(answer.getText().toString());
        if(ans==3){
            Intent intent1 = new Intent(MainActivity5.this, MainActivity8.class);
            startActivity(intent1);
        }
        else{
            Intent intent2 = new Intent(MainActivity5.this, MainActivity7.class);
            startActivity(intent2);

        }

    }

}