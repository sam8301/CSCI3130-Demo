package com.example.acme.csci3130_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText txt;
    TextView text;
    Button btn;

    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=(Button)findViewById(R.id.mybutton);
        text= (TextView)findViewById(R.id.mytext);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                   txt = (EditText)findViewById(R.id.mytext);
                   text= (TextView)findViewById(R.id.view);
                   text.setText(txt.getText());
            }
        });
    }
}
