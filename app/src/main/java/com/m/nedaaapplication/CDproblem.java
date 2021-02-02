package com.m.nedaaapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import io.realm.Realm;

public class CDproblem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cdproblem);


        final CheckBox CD1=(CheckBox)findViewById(R.id.checkBox9);
        final CheckBox CD2=(CheckBox)findViewById(R.id.checkBox10);
        final CheckBox CD3=(CheckBox)findViewById(R.id.checkBox11);


        Realm.init(this);

        Button show=(Button)findViewById(R.id.button14);
        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                report report1=new report();

                report1.setType_proplem(CD1.isChecked());

                Realm realm=Realm.getDefaultInstance();
                realm.beginTransaction();
                realm.copyToRealmOrUpdate(report1);
                realm.commitTransaction();


                report report2=new report();

                report2.setType_proplem(CD2.isChecked());


                realm.copyToRealmOrUpdate(report2);
                realm.commitTransaction();

                report report3=new report();

                report3.setType_proplem(CD2.isChecked());


                realm.copyToRealmOrUpdate(report3);
                realm.commitTransaction();


                Toast.makeText(CDproblem.this,"تم ارسال المشكلة " ,Toast.LENGTH_SHORT).show();



            }
        });





    }
}
