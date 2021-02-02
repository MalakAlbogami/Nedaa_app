package com.m.nedaaapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import io.realm.Realm;
import io.realm.RealmQuery;
import io.realm.RealmResults;

public class Adminlogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adminlogin);



        final EditText Ausername=(EditText)findViewById(R.id.editText6);
        final EditText Apassword=(EditText)findViewById(R.id.editText10);

        Realm.init(this);


        Button show12=(Button)findViewById(R.id.button5);
        show12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//this is for register admin in the database.........
                Admin admin=new Admin();
                admin.setUsername(Ausername.getText().toString());
                admin.setPassword(Apassword.getText().toString());



                Realm realm=Realm.getDefaultInstance();
                realm.beginTransaction();
                realm.copyToRealmOrUpdate(admin);
                realm.commitTransaction();

                Toast.makeText(Adminlogin.this,"تم التسجيل" ,Toast.LENGTH_SHORT).show();





            }
        });

        Button show=(Button)findViewById(R.id.button30) ;
        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Realm realm=Realm.getDefaultInstance();
                RealmQuery<Admin> query=realm.where(Admin.class);
                query.equalTo("username",Ausername.getText().toString());
                query.equalTo("password",Apassword.getText().toString());
                RealmResults<Admin> results=query.findAll();
                if(results.size()>0){

                    Intent i12=new Intent(getApplicationContext(),reportDetails.class);
                    startActivity(i12);

                }else {
                    Toast.makeText(Adminlogin.this,"اسم المستخدم او كلمة المرور خاطئة" ,Toast.LENGTH_SHORT).show();
                }






            }
        });
    }
}
