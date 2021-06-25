package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Login_Form2 extends AppCompatActivity {
    EditText userName,userPassword;
    Button login;
    CheckBox ischeck;
    TextView output;
    RadioGroup gender_selection;
    RadioButton selectedgender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_form2);
        userName=findViewById(R.id.Lname);
        userPassword=findViewById(R.id.Lpass);
        login=findViewById(R.id.Llogin);
        ischeck=findViewById(R.id.is_check);
        gender_selection=findViewById(R.id.gender);

        output=findViewById(R.id.Loutput);

        Boolean checking=ischeck.isChecked();
        if(checking)
        {
            login.setVisibility(View.VISIBLE);
        }
        else
        {
            login.setVisibility(View.INVISIBLE);
        }
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=userName.getText().toString();
                String userpassword=userPassword.getText().toString();
                int selection=gender_selection.getCheckedRadioButtonId();
                selectedgender=findViewById(selection);
                output.setText("Name "+name+"\nPassword "+userpassword+"\nGender: "+selection);

                if (selection==-1)
                {
                    Toast.makeText(Login_Form2.this,"Nothink Pilled ",Toast.LENGTH_LONG).show();


                }
                else
                {
                    Toast.makeText(Login_Form2.this,selectedgender.getText(),Toast.LENGTH_LONG).show();
                }
                Toast.makeText(getApplicationContext(),"UserId: "+name+"\nUserPassword: "+userpassword+"\nGender: "+selection,Toast.LENGTH_LONG).show();
                Intent intent= new Intent(getApplicationContext(),sigup.class);
                startActivity(intent);
            }
        });



    }

    public void checkmate(View view) {

    }
}