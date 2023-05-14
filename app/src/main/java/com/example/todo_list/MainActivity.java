package com.example.todo_list;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView sign_txt = (TextView) findViewById(R.id.sign_in_link);
        sign_txt.setTextColor(Color.BLUE);
        sign_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //setContentView(R.layout.sign_in);
                Intent intent = new Intent(MainActivity.this, sign_in.class);
                startActivity(intent);

            }




        });

    }
}