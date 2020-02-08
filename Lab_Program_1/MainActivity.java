package com.example.myapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    float font=20;
    int ch=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button btnfnt=findViewById(R.id.button1);
        final Button btncol=findViewById(R.id.button2);
        final Button btntxt=findViewById(R.id.button3);
        final TextView tv=findViewById(R.id.tv);

        btnfnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setTextSize(font);
                font+=5;
                if(font==50)
                    font=20;
            }
        });

        btncol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(ch){
                    case 1:tv.setTextColor(Color.RED);break;
                    case 2:tv.setTextColor(Color.GREEN);break;
                    case 3:tv.setTextColor(Color.YELLOW);break;
                    case 4:tv.setTextColor(Color.BLACK);break;
                    case 5:tv.setTextColor(Color.BLUE);break;
                    case 6:tv.setTextColor(Color.CYAN);break;
                }
                ch++;
                if(ch>6)
                    ch=1;
            }
        });

        btntxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tv.getText()=="Hello World")
                    tv.setText("BMSCE");
                else
                    tv.setText("Hello World");
            }
        });
    }
}
