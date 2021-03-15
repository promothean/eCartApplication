package com.promothean.ecartapplication.navfragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.promothean.ecartapplication.R;

public class CategoriesFragment extends Fragment {
    private static final String TAG = "CategoriesFragment";

    public CategoriesFragment() { }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_categories, container, false);

        return view;
    }
}