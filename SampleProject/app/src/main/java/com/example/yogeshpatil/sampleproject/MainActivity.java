package com.example.yogeshpatil.sampleproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onRegister(View view){

        EditText collegename = (EditText) findViewById(R.id.clgname);
        EditText collegeid = (EditText) findViewById(R.id.clgid);
        EditText password = (EditText) findViewById(R.id.password);


        Log.i("Info", "Welcome to College Registration Portal");

        Log.i("college Name: ", collegename.getText().toString());
        Log.i("college ID: ", collegeid.getText().toString());
        Log.i("Password: ", password.getText().toString());

        Log.i("Register","Successfully");

        Toast.makeText(getBaseContext(), collegename.getText().toString()+" Register Successfully!!!", Toast.LENGTH_LONG).show();

    }
}
