package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class contactlist extends AppCompatActivity {
    ListView listView;
    ArrayList<Hero> heroes;
//    String[] cricketors={"Suneel Gavaskar","Sachin tendulkar","Mahendra Singh Dhoni","Yuvraj singh","KL Rahul","Smriti mandhana"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactlist);
        listView=findViewById(R.id.contact_items);

        heroes=new ArrayList<>();
        heroes.add(new Hero(R.drawable.spiderman,"SpiderMan","Avengers"));
        heroes.add(new Hero(R.drawable.ironman,"IronMan","Avengers"));
        heroes.add(new Hero(R.drawable.captain,"Captain","Avengers"));
        heroes.add(new Hero(R.drawable.thor,"Thor","Avengers"));

//       ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,R.layout.list_item,R.id.text_listItem,cricketors);
         MyContactAdapter myContactAdapter=new MyContactAdapter(this,heroes);
        listView.setAdapter(myContactAdapter);


//       listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//           @Override
//           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//           String value=myContactAdapter.getItem(position).toString();
//               Toast.makeText(contactlist.this,value,Toast.LENGTH_LONG).show();
//           }
//       });


    }
}