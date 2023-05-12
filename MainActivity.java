package com.example.assignment_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView name1,email1,password1;
   ImageView welcome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name1=(TextView) findViewById(R.id.textView);
        email1=(TextView) findViewById(R.id.textView2);
        password1=(TextView) findViewById(R.id.textView3);
        welcome=(ImageView) findViewById(R.id.imageView);




        //geting data from secondactivity we have  to call getextra()method
        Intent intent=getIntent();
        String str=intent.getStringExtra("message key");
        name1.setText("name => "+str);

        //for email
        String str1=intent.getStringExtra("email");
        email1.setText("email => "+str1);

        //for password
        String str2=intent.getStringExtra("password");
        password1.setText("Password => "+str2);

    }
}