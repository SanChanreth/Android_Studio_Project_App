package com.sanchanreth.efile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        // Find the "Get Started" button
        Button getStartedButton = findViewById(R.id.getStartedButton);

        // Set click listener for the button
        getStartedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Navigate to MainActivity (or any other activity you want to show next)
                Intent intent = new Intent(StartActivity.this, LoginActivity.class);
                startActivity(intent);
                finish(); // Finish StartActivity so the user can't navigate back to it
            }
        });
    }
}
