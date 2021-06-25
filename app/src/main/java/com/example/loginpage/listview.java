package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class listview extends AppCompatActivity {
    ListView listView;
    String[] cities={"London","India","America","Saudi","Lucknow"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        listView=findViewById(R.id.list);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(listview.this, android.R.layout.simple_dropdown_item_1line);
    }
}