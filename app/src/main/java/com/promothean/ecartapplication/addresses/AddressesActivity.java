package com.promothean.ecartapplication.addresses;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.promothean.ecartapplication.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.tombayley.activitycircularreveal.CircularReveal;

public class AddressesActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "AddressesActivity";
    private Toolbar toolBar;
    private FloatingActionButton btnAddAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addresses);

        toolBar = findViewById(R.id.toolBar);
        btnAddAddress = findViewById(R.id.btnAddAddress);

        setSupportActionBar(toolBar);

        toolBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        btnAddAddress.setOnClickListener(this);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnAddAddress) {
            CircularReveal.presentActivity(new CircularReveal.Builder(this, btnAddAddress, new Intent(this, AddNewAddressActivity.class), 1000));
        }
    }
}