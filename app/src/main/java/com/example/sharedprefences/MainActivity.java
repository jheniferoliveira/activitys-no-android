package com.example.sharedprefences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity<button> extends AppCompatActivity {

    private TextView textviewmainactivity;
    private Button buttonmainactivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonmainactivity = findViewById(R.id.buttonmainactivity);
        textviewmainactivity = findViewById(R.id.texteviewmainactivity);

        buttonmainactivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent novaacttivity = new Intent(getApplicationContext(), segundaactivity.class);
                startActivity(novaacttivity);

            }
        });
    }
}