package com.example.amplifyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.amplifyframework.core.Amplify;
import com.amplifyframework.predictions.models.LanguageType;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Amplify.Predictions.translateText(
                "I like to eat spaghetti",
                LanguageType.ENGLISH,
                LanguageType.SPANISH,
                result -> Log.i("AmplifyApp", result.getTranslatedText()),
                error -> Log.e("AmplifyApp", "Translation failed", error)
        );

    }
}