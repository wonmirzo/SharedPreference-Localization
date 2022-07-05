package com.wonmirzo.activitiy;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.wonmirzo.MyApplication;
import com.wonmirzo.R;
import com.wonmirzo.manager.LocaleManager;

public class LanguageActivity extends AppCompatActivity {
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language);
        initViews();
    }

    private void initViews() {
        context = this;
        Button btnEnglish = findViewById(R.id.btnEnglish);
        btnEnglish.setOnClickListener(view -> {
//            setLocale("en");
            MyApplication.localeManager.setNewLocale(context, LocaleManager.LANGUAGE_ENGLISH);
            finish();
        });
        Button btnRussian = findViewById(R.id.btnRussian);
        btnRussian.setOnClickListener(view -> {
//            setLocale("ru");
            MyApplication.localeManager.setNewLocale(context, LocaleManager.LANGUAGE_RUSSIAN);
            finish();
        });
        Button btnUzbek = findViewById(R.id.btnUzbek);
        btnUzbek.setOnClickListener(view -> {
//            setLocale("uz");
            MyApplication.localeManager.setNewLocale(context, LocaleManager.LANGUAGE_UZBEK);
            finish();
        });

        // one = 1
        String one = getResources().getQuantityString(R.plurals.my_cats, 1, 1);
        // few = 2~4
        String few = getResources().getQuantityString(R.plurals.my_cats, 2, 4);
        // many = 5~
        String many = getResources().getQuantityString(R.plurals.my_cats, 5, 14);

        Log.d("@@@one", one);
        Log.d("@@@few", few);
        Log.d("@@@many", many);
    }

    /*
     private void setLocale(String language) {
         Locale locale = new Locale(language);
         Locale.setDefault(locale);
         Configuration config = new Configuration();
         config.locale = locale;
         getBaseContext().getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());
         finish();
     }
    */
}