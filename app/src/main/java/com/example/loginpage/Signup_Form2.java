package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Signup_Form2 extends AppCompatActivity {
    EditText name,mobile,email,password,con_paswword;
    Button btn_signup;
    TextView output;
    CheckBox ischeck;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_form2);
        name=findViewById(R.id.Sname);
        mobile=findViewById(R.id.Smobile);
        email=findViewById(R.id.Semail);
        password=findViewById(R.id.Spass1);
        con_paswword=findViewById(R.id.Spass2);
        ischeck=findViewById(R.id.Scheck);
        btn_signup=findViewById(R.id.Ssignup);

        output=findViewById(R.id.Soutput);

        btn_signup.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
               String Name=name.getText().toString();
               String Mobile=mobile.getText().toString();
               String Email=email.getText().toString();
               String Password=password.getText().toString();
               String conPassword=con_paswword.getText().toString();

               output.setText("Name "+Name+"\nMobile No "+Mobile+"\nEmail Id "+Email+"\nPassword "+Password+"\n Confirm Password "+conPassword);
               Toast.makeText(getApplicationContext(),"Working....",Toast.LENGTH_LONG).show();
            }

        });
    }
    public void checkmate(View view) {
//            Button btnSubmit = findViewById(R.id.btn_signup);
        if(btn_signup.isEnabled())
            btn_signup.setEnabled(false);
        else btn_signup.setEnabled(true);
    }
}