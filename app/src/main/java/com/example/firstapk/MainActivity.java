package com.example.firstapk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    EditText editNama;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editNama = findViewById(R.id.editNama);
        Button btnSubmit = findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nama = editNama.getText().toString();

                Toast.makeText(getApplicationContext(), "Sukses",Toast.LENGTH_SHORT).show();

            }
        });

    }

  //  public void Submit(View view) {
   //     Toast.makeText(getApplicationContext(), "Mantap",Toast.LENGTH_SHORT).show();
  //  }
}