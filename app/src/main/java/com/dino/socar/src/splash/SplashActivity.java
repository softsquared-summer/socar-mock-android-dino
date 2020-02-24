package com.dino.socar.src.splash;

import android.content.Intent;
import android.os.Bundle;

import com.dino.socar.src.BaseActivity;
import com.dino.socar.src.main.MapActivity;

public class SplashActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        Intent intent = new Intent(this, MapActivity.class);
        startActivity(intent);
        finish();

    }
}
