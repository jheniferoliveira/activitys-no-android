package com.example.sharedprefences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class segundaactivity extends AppCompatActivity {

    private TextView textviewsegundaactivity;
    private Button buttonsegundaactivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundaactivity);

        buttonsegundaactivity = findViewById(R.id.buttonsegundaactivity);
        textviewsegundaactivity = findViewById(R.id.textviewsegundaactivity);

        buttonsegundaactivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent novaacttivity = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(novaacttivity);

            }
        });
    }
}
