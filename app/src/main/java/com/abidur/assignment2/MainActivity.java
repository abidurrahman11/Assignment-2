package com.abidur.assignment2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Button checkbtn, radiobtn, ratingbtn, seekbtn, switchbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        checkbtn = findViewById(R.id.checkbox);
        radiobtn = findViewById(R.id.radiobutton);
        ratingbtn = findViewById(R.id.ratingbar);
        seekbtn = findViewById(R.id.seekbar);
        switchbtn = findViewById(R.id.switches);

        checkbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CheckboxActivity.class);
                startActivity(intent);
            }
        });

        radiobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RadiobuttonActivity.class);
                startActivity(intent);
            }
        });

        ratingbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RatingbarActivity.class);
                startActivity(intent);
            }
        });

        seekbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SeekbarActivity.class);
                startActivity(intent);
            }
        });

        switchbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SwitchActivity.class);
                startActivity(intent);
            }
        });
    }
}