package com.example.addition136;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText et1 = (EditText)findViewById(R.id.editText);
        final EditText et2 = (EditText)findViewById(R.id.editText2);
        final Button btn = (Button)findViewById(R.id.button);
        final TextView tv = (TextView)findViewById(R.id.textView);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i1 = Integer.parseInt(et1.getText().toString());
                int i2 = Integer.parseInt(et2.getText().toString());

                int sum = i1 + i2;

                tv.setText("Sum = "+sum);
            }
        });

    }
}
