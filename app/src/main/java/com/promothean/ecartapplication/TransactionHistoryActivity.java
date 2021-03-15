package com.promothean.ecartapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class TransactionHistoryActivity extends AppCompatActivity {
    private static final String TAG = "TransactionHistoryActiv";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction_history);
    }
}