package com.example.lab_prog_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    Spinner s;

    String [] dept_array={"CSE","ISE","ECE","Mech","Civil"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button bt = (Button)findViewById(R.id.button2);
        final EditText name = (EditText) findViewById(R.id.editText6);
        final EditText reg = (EditText) findViewById(R.id.editText7);


        s=(Spinner)findViewById(R.id.spinner3);

        ArrayAdapter adapter = new
                ArrayAdapter(MainActivity.this,android.R.layout.simple_spinner_item,dept_array);
        s.setAdapter(adapter);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                i.putExtra("name_key",name);
                i.putExtra("reg_key",reg);
                i.putExtra("dept_key",dept);
                startActivity(i);

            }
        });
    }
}
