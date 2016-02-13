package com.example.r.android1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;


public class MainActivity extends Activity {
    ListView list;
    String[] name = {
            "Mr. Papa",
            "Mrs. Mom",
            "Mr. Bro",
            "Ms. Sis",
            "Mr. GrandPa",
            "Mrs. GrandMa",
            "Mr. Little sis"
    } ;
    String[] relation = {
            "Father",
            "Mother",
            "Brother",
            "Sister",
            "GrandFather",
            "GrandMother",
            "Cousin"
    } ;
    Integer[] imageId = {
            R.drawable.profile,
            R.drawable.profile,
            R.drawable.profile,
            R.drawable.profile,
            R.drawable.profile,
            R.drawable.profile,
            R.drawable.profile,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        family adapter = new family(MainActivity.this, name, relation, imageId);
        list=(ListView)findViewById(R.id.listView);
        list.setAdapter(adapter);
    }

}
