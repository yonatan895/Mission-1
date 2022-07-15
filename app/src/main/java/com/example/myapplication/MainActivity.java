package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    Button button1;
    Button button2;
    Button button3;
    int x = 5;
    String st = "Your number: ";
    String st2 = "Your number: 5 ";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.tv);
        Button button1 = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        tv.setText(st2);
    }
    public void add(View view) {

        if(view.getId() == R.id.button1)
        {
            x+=1;
        }
        else if(view.getId() == R.id.button2) {
            x+=2;
        }
        else if(view.getId() == R.id.button3) {
            x+=3;
        }
        update_num(tv, x);



    }
    public void update_num(TextView view, int x) {
        view.setText(st + x);

    }
}