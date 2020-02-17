package com.dino.socar.src.splash;

import android.content.Intent;
import android.os.Bundle;

import com.dino.socar.src.BaseActivity;

public class SplashActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = new Intent(this, AuthActivity.class);
        startActivity(intent);
        finish();

    }
}
