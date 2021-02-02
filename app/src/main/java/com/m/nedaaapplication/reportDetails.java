package com.m.nedaaapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

import io.realm.Realm;
import io.realm.RealmResults;

public class reportDetails extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report_details);


       Realm.init(this);








    }

    @Override
    protected void onResume() {
        super.onResume();



        Realm realm=Realm.getDefaultInstance();
        realm.beginTransaction();
        List<user> users =realm.where(user.class).equalTo("name","afnan").findAll();
        String[] all=new String[users.size()];

        String[] allphone=new String[users.size()];


        for(int i=0;i<all.length;i++){
            all[i]=users.get(i).getName();




        }
        final ListView showname=(ListView) findViewById(R.id.list);


        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,all);

        showname.setAdapter(adapter);


        for(int i=0;i<allphone.length;i++){

            allphone[i]=users.get(i).getPhone();

        }
        final ListView showphone=(ListView) findViewById(R.id.list1);
        ArrayAdapter<String> adapter1=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,allphone);

        showphone.setAdapter(adapter1);




    }



}
