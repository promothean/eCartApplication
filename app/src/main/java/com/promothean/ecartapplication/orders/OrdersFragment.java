package com.promothean.ecartapplication.orders;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.promothean.ecartapplication.R;
import com.promothean.ecartapplication.adapter.OrderAdapter;
import com.promothean.ecartapplication.model.Order;

import java.util.ArrayList;
import java.util.List;

public class OrdersFragment extends Fragment {
    private static final String TAG = "OrdersFragment";
    private String category;
    private LinearLayout layoutNoOrder;
    private RecyclerView recyclerOrders;
    private OrderAdapter orderAdapter;
    private List<Order> orders;

    public OrdersFragment(String category) {
        this.category = category;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_orders, container, false);

        layoutNoOrder = view.findViewById(R.id.layoutNoOrder);
        recyclerOrders = view.findViewById(R.id.recyclerOrders);

        //Back End Code
        layoutNoOrder.setVisibility(View.GONE);
        recyclerOrders.setVisibility(View.VISIBLE);
        loadOrders(category);

        return view;
    }

    private void loadOrders(String category) {
        orders = new ArrayList<>();

        if (category.equals("In-Process")) {
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "In-Process", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "In-Process", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "In-Process", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "In-Process", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "In-Process", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "In-Process", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "In-Process", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "In-Process", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "In-Process", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "In-Process", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "In-Process", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "In-Process", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "In-Process", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "In-Process", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "In-Process", "Place order on : 13/03/2021", "For amount : $200"));
        } else if (category.equals("Shipped")) {
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Shipped", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Shipped", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Shipped", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Shipped", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Shipped", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Shipped", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Shipped", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Shipped", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Shipped", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Shipped", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Shipped", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Shipped", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Shipped", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Shipped", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Shipped", "Place order on : 13/03/2021", "For amount : $200"));
        } else if (category.equals("Delivered")) {
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Delivered", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Delivered", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Delivered", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Delivered", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Delivered", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Delivered", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Delivered", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Delivered", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Delivered", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Delivered", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Delivered", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Delivered", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Delivered", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Delivered", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Delivered", "Place order on : 13/03/2021", "For amount : $200"));
        } else if (category.equals("Cancelled")) {
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Cancelled", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Cancelled", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Cancelled", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Cancelled", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Cancelled", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Cancelled", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Cancelled", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Cancelled", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Cancelled", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Cancelled", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Cancelled", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Cancelled", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Cancelled", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Cancelled", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Cancelled", "Place order on : 13/03/2021", "For amount : $200"));
        } else if (category.equals("Returned")) {
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Returned", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Returned", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Returned", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Returned", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Returned", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Returned", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Returned", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Returned", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Returned", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Returned", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Returned", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Returned", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Returned", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Returned", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Returned", "Place order on : 13/03/2021", "For amount : $200"));
        } else {
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "In-Process", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "In-Process", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "In-Process", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "In-Process", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "In-Process", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "In-Process", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "In-Process", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "In-Process", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "In-Process", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "In-Process", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "In-Process", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "In-Process", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "In-Process", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "In-Process", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "In-Process", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Shipped", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Shipped", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Shipped", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Shipped", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Shipped", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Shipped", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Shipped", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Shipped", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Shipped", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Shipped", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Shipped", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Shipped", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Shipped", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Shipped", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Shipped", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Delivered", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Delivered", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Delivered", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Delivered", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Delivered", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Delivered", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Delivered", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Delivered", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Delivered", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Delivered", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Delivered", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Delivered", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Delivered", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Delivered", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Delivered", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Cancelled", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Cancelled", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Cancelled", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Cancelled", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Cancelled", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Cancelled", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Cancelled", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Cancelled", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Cancelled", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Cancelled", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Cancelled", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Cancelled", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Cancelled", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Cancelled", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Cancelled", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Returned", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Returned", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Returned", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Returned", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Returned", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Returned", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Returned", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Returned", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Returned", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Returned", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Returned", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Returned", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Returned", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Returned", "Place order on : 13/03/2021", "For amount : $200"));
            orders.add(new Order("Order No 1111", "04 Item(s)", "Item 1, Item 2, Item 3, Item 4", "Returned", "Place order on : 13/03/2021", "For amount : $200"));
        }

        orderAdapter = new OrderAdapter(this.getContext(), orders);
        recyclerOrders.setAdapter(orderAdapter);
    }
}