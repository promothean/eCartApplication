package com.promothean.ecartapplication.addresses;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.promothean.ecartapplication.R;
import com.promothean.ecartapplication.adapter.AddressAdapter;
import com.promothean.ecartapplication.model.Address;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.tombayley.activitycircularreveal.CircularReveal;

import java.util.ArrayList;
import java.util.List;

public class AddressesActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "AddressesActivity";
    private Toolbar toolBar;
    private FloatingActionButton btnAddAddress;
    private LinearLayout layoutNoAddress;
    private RecyclerView recyclerAddresses;
    private AddressAdapter addressAdapter;
    private List<Address> addresses;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addresses);

        toolBar = findViewById(R.id.toolBar);
        btnAddAddress = findViewById(R.id.btnAddAddress);
        layoutNoAddress = findViewById(R.id.layoutNoAddress);
        recyclerAddresses = findViewById(R.id.recyclerAddresses);

        recyclerAddresses.setVisibility(View.GONE);
        layoutNoAddress.setVisibility(View.VISIBLE);

        setSupportActionBar(toolBar);

        toolBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        btnAddAddress.setOnClickListener(this);

        loadAddresses();
    }

    private void loadAddresses() {
        addresses = new ArrayList<>();

        addresses.add(new Address("Muhammad Inzmam", "+92 3045068602", true, true, "Home", "Kallar Syedan, Rawalpindi, Punjab, Pakistan, 47390", true));
        addresses.add(new Address("Muhammad Inzmam", "+92 3045068602", false, true, "Office", "Kallar Syedan, Rawalpindi, Punjab, Pakistan, 47390", false));

        addressAdapter = new AddressAdapter(this, addresses);
        recyclerAddresses.setAdapter(addressAdapter);
        layoutNoAddress.setVisibility(View.GONE);
        recyclerAddresses.setVisibility(View.VISIBLE);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnAddAddress:
                CircularReveal.presentActivity(new CircularReveal.Builder(this, btnAddAddress, new Intent(this, AddNewAddressActivity.class), 1000));
                break;
        }
    }
}