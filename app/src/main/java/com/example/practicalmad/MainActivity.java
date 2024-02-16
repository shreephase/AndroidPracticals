package com.example.practicalmad;

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
        setContentView(R.layout.pr_7_e2);
        Button btn = findViewById(R.id.btn);
        EditText name = findViewById(R.id.name);
        EditText age = findViewById(R.id.age);
        EditText roll = findViewById(R.id.roll);
        TextView dname = findViewById(R.id.dname);
        TextView dage = findViewById(R.id.dage);
        TextView droll = findViewById(R.id.droll);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dname.setText("Name : "+name.getText());
                dage.setText("Age : "+age.getText());
                droll.setText("Roll : "+roll.getText());
            }
        });
    }
}