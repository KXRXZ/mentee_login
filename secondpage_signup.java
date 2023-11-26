package com.example.signupform_mentor;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.os.Bundle;
import android.widget.Toast;


public class secondpage_signup extends AppCompatActivity {
    CheckBox ch, ch1, ch2, ch3, ch4, ch5;

    private Spinner testSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondpage_signup);

        //  editTextAge
        EditText editTextAge = findViewById(R.id.editTextAge);
        editTextAge.setTextColor(Color.WHITE);

        testSpinner = findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.courses, android.R.layout.simple_spinner_dropdown_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        testSpinner.setAdapter(adapter);
        
        ch = findViewById(R.id.ComputerScience);
        ch1 = findViewById(R.id.Psychology);
        ch2 = findViewById(R.id.Arts);
        ch3 = findViewById(R.id.TourismManagement);
        ch4 = findViewById(R.id.Culinary);
        ch5 = findViewById(R.id.CreativeWriting);
    }

    public void Check(View v) {
        String msg = "";

        if (ch.isChecked())
            msg = msg + " ComputerScience ";
        if (ch1.isChecked())
            msg = msg + " Psychology ";
        if (ch2.isChecked())
            msg = msg + " Arts ";
        if (ch3.isChecked())
            msg = msg + " TourismManagement ";
        if (ch4.isChecked())
            msg = msg + " Culinary ";
        if (ch5.isChecked())
            msg = msg + " CreativeWriting ";

        Toast.makeText(this, msg + "are selected",
                Toast.LENGTH_LONG).show();
    }
}