package com.example.attempt3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText videoURL;
    Button PlayButon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PlayButon = findViewById(R.id.playbutton);
        videoURL = findViewById(R.id.editTextTextPersonName);

        PlayButon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String url = videoURL.getText().toString();
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("url",url);
                startActivity(intent);

            }
        });


    }
}