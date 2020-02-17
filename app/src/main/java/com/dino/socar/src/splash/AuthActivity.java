package com.dino.socar.src.splash;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.dino.socar.R;
import com.dino.socar.src.BaseActivity;
import com.dino.socar.src.mid.MidActivity;

public class AuthActivity extends BaseActivity {

    private Button auth_btn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.auth_activity);

        auth_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AuthActivity.this, MidActivity.class);
                startActivity(intent);

            }
        });

    }



}


