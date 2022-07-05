package com.wonmirzo.activitiy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.wonmirzo.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        Button button = findViewById(R.id.btnHome);
        button.setText(getString(R.string.app_name));

        button.setOnClickListener((view -> {
            callLanguageActivity();
        }));
    }

    private void callLanguageActivity() {
        Intent intent = new Intent(this, LanguageActivity.class);
        startActivity(intent);
    }

    private void callPreferenceActivity() {
        Intent intent = new Intent(this, PreferenceActivity.class);
        startActivity(intent);
    }
}