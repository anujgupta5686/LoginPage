package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class sigup extends AppCompatActivity {
    EditText userName11,userMobile11,userEmailId11,newPassword11,coPassword11;
    Button userSignup11;
    TextView output11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sigup);
        userName11=findViewById(R.id.userName);
        userMobile11=findViewById(R.id.userMobile);
        userEmailId11=findViewById(R.id.userEmaiId);
        newPassword11=findViewById(R.id.newPassword);
        coPassword11=findViewById(R.id.coPassword);
        userSignup11=findViewById(R.id.userSignup);
        output11=findViewById(R.id.output);

        userSignup11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=userName11.getText().toString();
                String mobile=userMobile11.getText().toString();
                String email=userEmailId11.getText().toString();
                String pass=newPassword11.getText().toString();
                String con_pass=coPassword11.getText().toString();
                output11.setText("Name: "+name+"\nMobile No: "+mobile+"\nEmail Id: "+email+"\nPassword: "+pass+"\nConfirm_Password: "+con_pass);
                Toast.makeText(getApplicationContext(),"Working On....",Toast.LENGTH_LONG).show();
            }
        });
    }
}