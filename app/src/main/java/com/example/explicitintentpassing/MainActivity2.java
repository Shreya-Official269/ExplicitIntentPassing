package com.example.explicitintentpassing;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    TextView textView1, textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView1 = findViewById(R.id.title);
        textView2 = findViewById(R.id.rollNo);



        //Getting Data Explicitly from First Activity in Key Value pairs
        // using Get (DataType) Extras and Assigning the value to the corresponding Variable


        Intent intent = getIntent();

        String title = intent.getStringExtra("title");
        int rollNo = intent.getIntExtra("Roll No",0);

        //Setting text to textViews

        textView1.setText(title);
        textView2.setText(String.valueOf(rollNo));

    }
}