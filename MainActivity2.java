package com.example.assignment_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    EditText name,email,password;
    Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        name=(EditText) findViewById(R.id.editTextTextPersonName);
        email=(EditText) findViewById(R.id.editTextTextPersonName2);
        password=(EditText)findViewById(R.id.editTextTextPersonName3);
        register=(Button) findViewById(R.id.button);


        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String ed_text=name.getText().toString().trim();
                String ed_text1=email.getText().toString().trim();
                String ed_text2=password.getText().toString().trim();


                    //Edittext is not empty
                    Intent intent=new Intent(MainActivity2.this,MainActivity.class);
                    intent.putExtra("message key",ed_text);
                    intent.putExtra("email",ed_text1);
                    intent.putExtra("password",ed_text2);
                    //call the start activity
                    startActivity(intent);

                    //for recive the data we have to write th egetString extra method



            }
        });




    }
}