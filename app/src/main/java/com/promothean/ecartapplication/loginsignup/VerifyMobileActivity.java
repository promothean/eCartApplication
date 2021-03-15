package com.promothean.ecartapplication.loginsignup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;

import com.promothean.ecartapplication.R;

public class VerifyMobileActivity extends AppCompatActivity {
    private static final String TAG = "VerifyMobileActivity";
    private Toolbar toolBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_mobile);

        toolBar = findViewById(R.id.toolBar);

        setSupportActionBar(toolBar);
        toolBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}