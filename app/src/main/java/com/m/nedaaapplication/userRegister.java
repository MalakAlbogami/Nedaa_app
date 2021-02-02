package com.m.nedaaapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import io.realm.Realm;

public class userRegister extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_register);

        final EditText fullName=(EditText)findViewById(R.id.editText);
        final EditText phoneNum=(EditText)findViewById(R.id.editText2);
        final EditText RUusername=(EditText)findViewById(R.id.editText3);
        final EditText RUpassword=(EditText)findViewById(R.id.editText4);



        Realm.init(this);





        Button show5=(Button)findViewById(R.id.button4);
        show5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {




                user U=new user();
                U.setName(fullName.getText().toString());
                U.setPhone(phoneNum.getText().toString());
                U.setUsername(RUusername.getText().toString());
                U.setPassword(RUpassword.getText().toString());

                Realm realm=Realm.getDefaultInstance();
                realm.beginTransaction();
                realm.copyToRealmOrUpdate(U);
                realm.commitTransaction();

                Toast.makeText(userRegister.this,"تم التسجيل" ,Toast.LENGTH_SHORT).show();

                Intent i5=new Intent(getApplicationContext(),userMainPage.class);
                startActivity(i5);
            }
        });;
    }
}
