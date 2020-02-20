package com.dino.socar.src.mid;

import android.os.Bundle;

import androidx.viewpager.widget.ViewPager;

import com.dino.socar.R;
import com.dino.socar.src.BaseActivity;

public class MidActivity extends BaseActivity {

    Mid_Adapter mid_adapter;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_mid);
        viewPager = (ViewPager)findViewById(R.id.mid_ViewPager);
        mid_adapter = new Mid_Adapter(this);
        viewPager.setAdapter(mid_adapter);
    }
}
