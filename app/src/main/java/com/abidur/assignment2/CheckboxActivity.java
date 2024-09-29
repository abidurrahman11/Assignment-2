package com.abidur.assignment2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class CheckboxActivity extends AppCompatActivity {

    private CheckBox ch1, ch2, ch3, ch4;
    private TextView tv;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_checkbox);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ch1 = findViewById(R.id.py);
        ch2 = findViewById(R.id.c);
        ch3 = findViewById(R.id.cpp);
        ch4 = findViewById(R.id.java);
        tv = findViewById(R.id.res);
        btn = findViewById(R.id.submit);

        ArrayList<String> list = new ArrayList<>();

        ch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (ch1.isChecked()) {
                    list.add(ch1.getText().toString());
                } else {
                    list.remove(ch1.getText().toString());
                }
            }
        });

        ch2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (ch2.isChecked()) {
                    list.add(ch2.getText().toString());
                } else {
                    list.remove(ch2.getText().toString());
                }
            }
        });

        ch3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (ch3.isChecked()) {
                    list.add(ch3.getText().toString());
                } else {
                    list.remove(ch3.getText().toString());
                }
            }
        });

        ch4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (ch4.isChecked()) {
                    list.add(ch4.getText().toString());
                } else {
                    list.remove(ch4.getText().toString());
                }
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder s = new StringBuilder();
                for (String e: list) {
                    s.append(e + "\n");
                }
                tv.setText(s);
            }
        });
    }
}