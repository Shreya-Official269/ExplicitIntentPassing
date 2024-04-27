package com.example.explicitintentpassing;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.Button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                //explicit Intent Passing
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);


                //Passing Data explicitly to Second Activity in Key Value Pair using Put Extras
                intent.putExtra("Title","Home");
                intent.putExtra("Roll No",10);

                //Starting the next Activity
                startActivity(intent);
            }
        });
    }
}