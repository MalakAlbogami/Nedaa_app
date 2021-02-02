package com.m.nedaaapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class RCproblem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rcproblem);

        final Button show5=(Button)findViewById(R.id.button16);
        show5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(RCproblem.this,"تم ارسال المشلكة" ,Toast.LENGTH_SHORT).show();


            }
        });

    }
}
