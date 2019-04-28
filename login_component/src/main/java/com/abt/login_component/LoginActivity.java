package com.abt.login_component;

import android.app.Activity;
import android.os.Bundle;

public class LoginActivity extends Activity {

    public static final String EXTRA_TARGET_ACTIVITY = "EXTRA_TARGET_ACTIVITY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
}
