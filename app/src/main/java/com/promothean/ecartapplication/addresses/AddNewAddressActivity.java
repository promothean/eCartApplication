package com.promothean.ecartapplication.addresses;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;

import com.promothean.ecartapplication.R;

public class AddNewAddressActivity extends AppCompatActivity {
    private static final String TAG = "AddNewAddressActivity";
    private Toolbar toolBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_address);

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