package com.abidur.assignment2;

import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class RatingbarActivity extends AppCompatActivity {

    private RatingBar rtbar;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_ratingbar);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        rtbar = findViewById(R.id.rate);
        tv = findViewById(R.id.res);

        rtbar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                if (rating == 1) {
                    tv.setText("1 Star : Very bad");
                } else if (rating == 2) {
                    tv.setText("2 Star : Bad");
                } else if (rating == 3) {
                    tv.setText("3 Star : Average");
                } else if (rating == 4) {
                    tv.setText("4 Star : Good");
                } else if (rating == 5) {
                    tv.setText("5 Star : Very Good");
                } else {
                    tv.setText("");
                }
            }
        });
    }
}