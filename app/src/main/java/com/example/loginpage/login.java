package com.example.loginpage;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class login extends AppCompatActivity {
    EditText userName,userPassword;
    Button userLogin;
    TextView txt_output;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        userName=findViewById(R.id.userName);
        userPassword=findViewById(R.id.userPassword);
        userLogin=findViewById(R.id.userLogin);
        txt_output=findViewById(R.id.txt_output);
        userLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Working",Toast.LENGTH_SHORT).show();
            }
        });



    }
}