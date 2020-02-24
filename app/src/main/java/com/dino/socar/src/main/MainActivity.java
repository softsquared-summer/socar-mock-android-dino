package com.dino.socar.src.main;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.dino.socar.R;
import com.dino.socar.src.BaseActivity;
import com.dino.socar.src.main.interfaces.MainActivityView;

public class MainActivity extends BaseActivity implements MainActivityView {

    private TextView mTv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    private void tryGetTest() {
        showProgressDialog();

        final MainService mainService = new MainService(this);
        mainService.getTest();
    }

    @Override
    public void validateSuccess(String text) {

        hideProgressDialog();
        mTv.setText(text);

    }

    @Override
    public void validateFailure(String message) {

        hideProgressDialog();
        showCustomToast(message == null || message.isEmpty() ? getString(R.string.network_error) : message);

    }

    public void customOnClick(View view) {
        switch (view.getId()) {
            case R.id.main_tv_text_view:
                tryGetTest();
                break;
            default:
                break;
        }
    }
}

