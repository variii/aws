package com.example.amplifyapp;

import android.app.Application;
import android.util.Log;

import com.amplifyframework.AmplifyException;
import com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.predictions.aws.AWSPredictionsPlugin;
import com.amplifyframework.predictions.models.LanguageType;

public class AmplifyApp extends Application {

    public void onCreate() {
        super.onCreate();

        try {
            // add translation plugins
            Amplify.addPlugin(new AWSCognitoAuthPlugin());
            Amplify.addPlugin(new AWSPredictionsPlugin());

            // this is from the skeleton
            Amplify.configure(getApplicationContext());

            Log.i("AmplifyApp", "Initialized Amplify");
        } catch (AmplifyException error) {
            Log.e("AmplifyApp", "Could not initialize Amplify", error);
        }
    }
}
