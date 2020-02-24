package com.dino.socar.src.mid;

import android.os.Bundle;

import androidx.viewpager.widget.ViewPager;

import com.dino.socar.R;
import com.dino.socar.src.BaseActivity;

public class MidActivity extends BaseActivity {

    MidAdapter mid_adapter;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_mid);

    }
}