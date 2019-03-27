package com.zc.logincomponent;

import android.app.Activity;
import android.os.Bundle;

public class LoginActivity extends Activity {
    public static final String EXTRA_TARGET_CLASS = "EXTRA_TARGET_CLASS";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
}
