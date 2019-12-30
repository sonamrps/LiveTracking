package com.pecon.co.in.livetracking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etFirstname,etLastname,etEmail,etPhoneno,etusername,etpassword;
    Button btnSignup,btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etFirstname=findViewById(R.id.etFirstname);
        etLastname=findViewById(R.id.etLastname);
        etEmail=findViewById(R.id.etEmail);
        etPhoneno=findViewById(R.id.etPhoneno);
        etusername=findViewById(R.id.etusername);
        etpassword=findViewById(R.id.etpassword);
        btnSignup=findViewById(R.id.btnSignup);
        btnLogin=findViewById(R.id.btnLogin);


        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String Firstname=etFirstname.getText().toString();
                String Lastname=etLastname.getText().toString();
                String Email=etEmail.getText().toString();
                String Phoneno=etPhoneno.getText().toString();
                String username=etusername.getText().toString();
                String Password=etpassword.getText().toString();
                String type="Signup";
                BackgroundTask backgroundTask=new BackgroundTask(getApplicationContext());
                backgroundTask.execute(type,Firstname,Lastname,Email,Phoneno,username,Password);

                if (Firstname.equals(true)&& Lastname.equals(true)&& Email.equals(true)&& Phoneno.equals(true)&& Password.equals(true)&& username.equals(true));
                Toast.makeText(MainActivity.this,"data inserted successfully",Toast.LENGTH_LONG).show();
                if (Firstname.equals(true)&& Lastname.equals(true)&& Email.equals(true)&& Phoneno.equals(true)&& Password.equals(true)&& username.equals(true));
                Toast.makeText(MainActivity.this,"please insert the data",Toast.LENGTH_LONG).show();







            }
        });
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Login.class);
                startActivity(i);
            }
        });


    }

}
