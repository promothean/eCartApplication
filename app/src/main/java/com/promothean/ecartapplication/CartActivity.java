package com.promothean.ecartapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.promothean.ecartapplication.adapter.CartAdapter;
import com.promothean.ecartapplication.model.Cart;

import java.util.ArrayList;
import java.util.List;

public class CartActivity extends AppCompatActivity {
    private static final String TAG = "CartActivity";
    private Toolbar toolBar;
    private LinearLayout layoutNoCartProduct;
    private RecyclerView recyclerCartProducts;
    private RelativeLayout layoutProceed;
    private TextView txtTotalPrice;
    private TextView txtNoItems;
    private Button btnProceed;
    private CartAdapter cartAdapter;
    private List<Cart> carts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        toolBar = findViewById(R.id.toolBar);
        layoutNoCartProduct = findViewById(R.id.layoutNoCartProduct);
        recyclerCartProducts = findViewById(R.id.recyclerCartProducts);
        layoutProceed = findViewById(R.id.layoutProceed);
        txtTotalPrice = findViewById(R.id.txtTotalPrice);
        txtNoItems = findViewById(R.id.txtNoItems);
        btnProceed = findViewById(R.id.btnProceed);

        setSupportActionBar(toolBar);

        toolBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        btnProceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CartActivity.this, "Proceed", Toast.LENGTH_SHORT).show();
            }
        });

        loadCartProducts();
    }

    private void loadCartProducts() {
        carts = new ArrayList<>();

        carts.add(new Cart(R.drawable.img_new_arrival_1, "Product Name", "30 mg", "$130", "$150", "1", "$130"));
        carts.add(new Cart(R.drawable.img_new_arrival_2, "Product Name", "30 mg", "$130", "$150", "1", "$130"));
        carts.add(new Cart(R.drawable.img_new_arrival_3, "Product Name", "30 mg", "$130", "$150", "1", "$130"));

        cartAdapter = new CartAdapter(CartActivity.this, carts);
        recyclerCartProducts.setAdapter(cartAdapter);
    }
}