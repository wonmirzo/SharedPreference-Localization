package com.wonmirzo.activitiy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.wonmirzo.R;
import com.wonmirzo.manager.PrefsManager;

public class PreferenceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preference);
        initViews();
    }

    private void initViews() {
        EditText etEmail = findViewById(R.id.etEmail);
        Button btnSave = findViewById(R.id.btnSave);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = etEmail.getText().toString();
                new PrefsManager(getApplicationContext()).saveData("email", email);
            }
        });
    }

    /*void saveEmail(String email) {
        SharedPreferences prefs = getApplicationContext().getSharedPreferences("MyPref", MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();

        editor.putString("email", email);
        editor.apply();
    }

    String loadEmail() {
        SharedPreferences prefs = getApplicationContext().getSharedPreferences("MyPref", MODE_PRIVATE);
        return prefs.getString("email", "pdp@gmail.com");
    }

    void removeEmail() {
        SharedPreferences prefs = getApplicationContext().getSharedPreferences("MyPref", MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();

        editor.remove("email");
        editor.apply();
    }

    void clearAll() {
        SharedPreferences prefs = getApplicationContext().getSharedPreferences("MyPref", MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.clear();
        editor.apply();
    }*/
}