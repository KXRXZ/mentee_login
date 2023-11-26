package com.example.signupform_mentor;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editTextFirstName = findViewById(R.id.editTextFirstName);
        editTextFirstName.setTextColor(Color.WHITE);


        EditText editTextLastName = findViewById(R.id.editTextLastName);
        editTextLastName.setTextColor(Color.WHITE);


        EditText editTextEmail = findViewById(R.id.editTextEmail);
        editTextEmail.setTextColor(Color.WHITE);


        EditText editTextPassword = findViewById(R.id.editTextPassword);
        editTextPassword.setTextColor(Color.WHITE);


        EditText editTextConfirmPassword = findViewById(R.id.editTextConfirmPassword);
        editTextConfirmPassword.setTextColor(Color.WHITE);

        Button navigateButton = findViewById(R.id.btnNext);
        navigateButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                // Create an Intent to start the SecondActivity
                Intent intent = new Intent(MainActivity.this, secondpage_signup.class);
                startActivity(intent);
            }
        });
    }
}