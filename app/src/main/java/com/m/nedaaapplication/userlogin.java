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

public class userlogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userlogin);

        final EditText Uusername=(EditText)findViewById(R.id.editText5);
        final EditText Upassword=(EditText)findViewById(R.id.editText8);

        Realm.init(this);


        Button show4=(Button)findViewById(R.id.button6);
        show4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Realm realm=Realm.getDefaultInstance();
                RealmQuery<user> query=realm.where(user.class);
                query.equalTo("username",Uusername.getText().toString());
                query.equalTo("password",Upassword.getText().toString());
                RealmResults<user> results=query.findAll();
                if(results.size()>0){


                    Intent i4=new Intent(getApplicationContext(),userMainPage.class);
                    startActivity(i4);

                }else {
                    Toast.makeText(userlogin.this,"اسم المستخدم او كلمة المرور خاطئة" ,Toast.LENGTH_SHORT).show();
                }


            }
        });
    }
}
