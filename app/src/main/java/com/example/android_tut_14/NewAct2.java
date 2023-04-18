package com.example.android_tut_14;

// MainActivity.java

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class NewAct2 extends AppCompatActivity implements View.OnClickListener {

    private Button noDataButton, dataButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        noDataButton = findViewById(R.id.no_data_button);
        dataButton = findViewById(R.id.data_button);

        noDataButton.setOnClickListener(this);
        dataButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.no_data_button:
                startActivity(new Intent(NewAct2.this, SecondActivity.class));
                break;
            case R.id.data_button:
                Intent intent = new Intent(NewAct2.this, SecondActivity.class);
                intent.putExtra("name", "John");
                intent.putExtra("age", 25);
                startActivity(intent);
                break;
        }
    }
}

