package com.example.ea.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Random ran;

    int randomInt;

    void makeToast(String string){
        Toast.makeText(MainActivity.this,string,Toast.LENGTH_SHORT).show();
    }

    void myFunction(View view){
        EditText u = (EditText)findViewById(R.id.userGuess);

        int userGuess = Integer.parseInt(u.getText().toString());

        int i = 1 ;
        int d = 1 ;
        while(i <= userGuess){
            if(i == userGuess){
                makeToast("Triangular number");
                break;
            }
            d = d+1;
            i = i+d;
        }
        if(i != userGuess){
            makeToast("Not a Triangular number");
        }
    }


    void mySquare(View view){
        EditText u = (EditText)findViewById(R.id.userGuess);

        double userGuess = Double.parseDouble(u.getText().toString());
        double i = Math.sqrt(userGuess);
        if(Math.floor(i) == Math.sqrt(userGuess)){
            makeToast("Square number");
        }
        else{
            makeToast("Not a Square Number");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
