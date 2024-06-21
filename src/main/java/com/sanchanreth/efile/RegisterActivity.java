package com.sanchanreth.efile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {

    private EditText registerEmail, registerPassword;
    private Button registerSubmitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        registerEmail = findViewById(R.id.register_email);
        registerPassword = findViewById(R.id.register_password);
        registerSubmitButton = findViewById(R.id.register_submit_button);

        registerSubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newEmail = registerEmail.getText().toString();
                String newPassword = registerPassword.getText().toString();

                // For simplicity, assume registration is always successful
                Toast.makeText(RegisterActivity.this, "Registration Successful", Toast.LENGTH_SHORT).show();

                // Return to login screen
                startActivity(new Intent(RegisterActivity.this, LoginActivity.class));
            }
        });
    }
}
