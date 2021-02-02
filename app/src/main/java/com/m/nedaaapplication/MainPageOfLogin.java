package com.m.nedaaapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainPageOfLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page_of_login);

        Button show=(Button)findViewById(R.id.button3);
        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),userRegister.class);
                startActivity(i);

            }
        });
        Button show1=(Button)findViewById(R.id.button2);
        show1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(getApplicationContext(),Adminlogin.class);
                startActivity(i1);
            }
        });

        Button show2=(Button)findViewById(R.id.button);
        show2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2=new Intent(getApplicationContext(),userlogin.class);
                startActivity(i2);

            }
        });
    }
}
