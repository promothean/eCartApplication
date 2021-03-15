package com.promothean.ecartapplication.orders;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.promothean.ecartapplication.R;

public class OrdersFragment extends Fragment {
    private static final String TAG = "OrdersFragment";

    public OrdersFragment() { }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_orders, container, false);

        return view;
    }
}