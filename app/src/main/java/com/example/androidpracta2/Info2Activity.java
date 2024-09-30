package com.example.androidpracta2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Info2Activity extends AppCompatActivity {

    ImageView imageView;
    TextView nameTextView;
    TextView descriptionTextView;
    Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info2);

        imageView = findViewById(R.id.imageViewDetail);
        nameTextView = findViewById(R.id.kittyNameTxtDetail);
        descriptionTextView = findViewById(R.id.kittyDescTxtDetail);
        backButton = findViewById(R.id.btn_back);

        Intent intent = getIntent();
        int imageResourceId = intent.getIntExtra("imageResourceId", 0);
        String name = intent.getStringExtra("name");
        String description = intent.getStringExtra("description");

        imageView.setImageResource(imageResourceId);
        nameTextView.setText(name);
        descriptionTextView.setText(description);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Info2Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

}