package com.promothean.ecartapplication.navfragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.promothean.ecartapplication.R;
import com.promothean.ecartapplication.adapter.CategoriesAdapter;
import com.promothean.ecartapplication.model.Categories;
import com.promothean.ecartapplication.model.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoriesFragment extends Fragment {
    private static final String TAG = "CategoriesFragment";
    private GridView gridCategories;
    private CategoriesAdapter categoriesAdapter;
    private List<Categories> categories;

    public CategoriesFragment() { }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_categories, container, false);

        gridCategories = view.findViewById(R.id.gridCategories);

        //Back End Coding
        loadCategories();

        return view;
    }

    private void loadCategories() {
        categories = new ArrayList<>();

        categories.add(new Categories(R.drawable.ic_cat_baby_needs, "Baby Needs"));
        categories.add(new Categories(R.drawable.ic_cat_home_supplies, "Home Supplies"));
        categories.add(new Categories(R.drawable.ic_cat_instant_foods, "Instant Foods"));
        categories.add(new Categories(R.drawable.ic_cat_grocery, "Grocery"));
        categories.add(new Categories(R.drawable.ic_cat_beverages, "Beverages"));
        categories.add(new Categories(R.drawable.ic_cat_cakes, "Cakes"));categories.add(new Categories(R.drawable.ic_cat_baby_needs, "Baby Needs"));
        categories.add(new Categories(R.drawable.ic_cat_home_supplies, "Home Supplies"));
        categories.add(new Categories(R.drawable.ic_cat_instant_foods, "Instant Foods"));
        categories.add(new Categories(R.drawable.ic_cat_grocery, "Grocery"));
        categories.add(new Categories(R.drawable.ic_cat_beverages, "Beverages"));
        categories.add(new Categories(R.drawable.ic_cat_cakes, "Cakes"));categories.add(new Categories(R.drawable.ic_cat_baby_needs, "Baby Needs"));
        categories.add(new Categories(R.drawable.ic_cat_home_supplies, "Home Supplies"));
        categories.add(new Categories(R.drawable.ic_cat_instant_foods, "Instant Foods"));
        categories.add(new Categories(R.drawable.ic_cat_grocery, "Grocery"));
        categories.add(new Categories(R.drawable.ic_cat_beverages, "Beverages"));
        categories.add(new Categories(R.drawable.ic_cat_cakes, "Cakes"));categories.add(new Categories(R.drawable.ic_cat_baby_needs, "Baby Needs"));
        categories.add(new Categories(R.drawable.ic_cat_home_supplies, "Home Supplies"));
        categories.add(new Categories(R.drawable.ic_cat_instant_foods, "Instant Foods"));
        categories.add(new Categories(R.drawable.ic_cat_grocery, "Grocery"));
        categories.add(new Categories(R.drawable.ic_cat_beverages, "Beverages"));
        categories.add(new Categories(R.drawable.ic_cat_cakes, "Cakes"));categories.add(new Categories(R.drawable.ic_cat_baby_needs, "Baby Needs"));
        categories.add(new Categories(R.drawable.ic_cat_home_supplies, "Home Supplies"));
        categories.add(new Categories(R.drawable.ic_cat_instant_foods, "Instant Foods"));
        categories.add(new Categories(R.drawable.ic_cat_grocery, "Grocery"));
        categories.add(new Categories(R.drawable.ic_cat_beverages, "Beverages"));
        categories.add(new Categories(R.drawable.ic_cat_cakes, "Cakes"));categories.add(new Categories(R.drawable.ic_cat_baby_needs, "Baby Needs"));
        categories.add(new Categories(R.drawable.ic_cat_home_supplies, "Home Supplies"));
        categories.add(new Categories(R.drawable.ic_cat_instant_foods, "Instant Foods"));
        categories.add(new Categories(R.drawable.ic_cat_grocery, "Grocery"));
        categories.add(new Categories(R.drawable.ic_cat_beverages, "Beverages"));
        categories.add(new Categories(R.drawable.ic_cat_cakes, "Cakes"));

        categoriesAdapter = new CategoriesAdapter(this.getContext(), categories);
        gridCategories.setAdapter(categoriesAdapter);
    }
}