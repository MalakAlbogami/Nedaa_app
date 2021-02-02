package com.m.nedaaapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;

import io.realm.Realm;

public class userMainPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_main_page);

        Realm.init(this);

        final Button show5=(Button)findViewById(R.id.button8);

        final report report=new report();






        show5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

              /*  report.setAdmain_name(show5.getText().toString());

                Realm realm=Realm.getDefaultInstance();
                realm.beginTransaction();
                realm.copyToRealmOrUpdate(report);
                realm.commitTransaction();*/

                Intent i5=new Intent(getApplicationContext(),CDproblem.class);
                startActivity(i5);




            }
        });





        final Button show6=(Button)findViewById(R.id.button7);
        show6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

             /*  report.setAdmain_name(show6.getText().toString());
                Realm realm=Realm.getDefaultInstance();
                realm.beginTransaction();
                realm.copyToRealmOrUpdate(report);
                realm.commitTransaction();*/


                Intent i6=new Intent(getApplicationContext(),PSproblem.class);
                startActivity(i6);

            }
        });

        final Button show7=(Button)findViewById(R.id.button10);
        show7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

             /*   report.setAdmain_name(show7.getText().toString());
                Realm realm=Realm.getDefaultInstance();
                realm.beginTransaction();
                realm.copyToRealmOrUpdate(report);
                realm.commitTransaction();*/


                Intent i7=new Intent(getApplicationContext(),RCproblem.class);
                startActivity(i7);
            }
        });

        final Button show8=(Button)findViewById(R.id.button9);
        show8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

             /*   report.setAdmain_name(show8.getText().toString());
                Realm realm=Realm.getDefaultInstance();
                realm.beginTransaction();
                realm.copyToRealmOrUpdate(report);
                realm.commitTransaction();*/

                Intent i8=new Intent(getApplicationContext(),EFproblem.class);
                startActivity(i8);
            }
        });

        final Button show9=(Button)findViewById(R.id.button11);
        show9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

         /*       report.setAdmain_name(show9.getText().toString());
                Realm realm=Realm.getDefaultInstance();
                realm.beginTransaction();
                realm.copyToRealmOrUpdate(report);
                realm.commitTransaction();*/

                Intent i9=new Intent(getApplicationContext(),ECMproblem.class);
                startActivity(i9);
            }
        });

        final Button show10=(Button) findViewById(R.id.button17);
        show10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

         /*       report.setAdmain_name(show10.getText().toString());
                Realm realm=Realm.getDefaultInstance();
                realm.beginTransaction();
                realm.copyToRealmOrUpdate(report);
                realm.commitTransaction();*/

                Intent i10=new Intent(getApplicationContext(),Services.class);
                startActivity(i10);
            }
        });
    }




}
