package com.promothean.ecartapplication.navfragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.promothean.ecartapplication.R;
import com.promothean.ecartapplication.adapter.FavoriteProductAdapter;
import com.promothean.ecartapplication.model.FavoriteProduct;

import java.util.ArrayList;
import java.util.List;

public class FavoriteFragment extends Fragment {
    private static final String TAG = "FavoriteFragment";
    private LinearLayout layoutNoFavoriteProduct;
    private RecyclerView recyclerFavoriteProducts;
    private FavoriteProductAdapter favoriteProductAdapter;
    private List<FavoriteProduct> favoriteProducts;

    public FavoriteFragment() { }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_favorite, container, false);

        layoutNoFavoriteProduct = view.findViewById(R.id.layoutNoFavoriteProduct);
        recyclerFavoriteProducts = view.findViewById(R.id.recyclerFavoriteProducts);

        //Back End Coding
        layoutNoFavoriteProduct.setVisibility(View.VISIBLE);
        recyclerFavoriteProducts.setVisibility(View.GONE);
        loadFavoriteProducts();

        return view;
    }

    private void loadFavoriteProducts() {
        favoriteProducts = new ArrayList<>();

        favoriteProducts.add(new FavoriteProduct(R.drawable.img_hot_deals_1, "Favorite Product ", "$130", "Added On : 13/03/2021"));
        favoriteProducts.add(new FavoriteProduct(R.drawable.img_hot_deals_2, "Favorite Product ", "$130", "Added On : 13/03/2021"));
        favoriteProducts.add(new FavoriteProduct(R.drawable.img_hot_deals_3, "Favorite Product ", "$130", "Added On : 13/03/2021"));
        favoriteProducts.add(new FavoriteProduct(R.drawable.img_hot_deals_4, "Favorite Product ", "$130", "Added On : 13/03/2021"));
        favoriteProducts.add(new FavoriteProduct(R.drawable.img_hot_deals_1, "Favorite Product ", "$130", "Added On : 13/03/2021"));
        favoriteProducts.add(new FavoriteProduct(R.drawable.img_hot_deals_2, "Favorite Product ", "$130", "Added On : 13/03/2021"));
        favoriteProducts.add(new FavoriteProduct(R.drawable.img_hot_deals_3, "Favorite Product ", "$130", "Added On : 13/03/2021"));
        favoriteProducts.add(new FavoriteProduct(R.drawable.img_hot_deals_4, "Favorite Product ", "$130", "Added On : 13/03/2021"));
        favoriteProducts.add(new FavoriteProduct(R.drawable.img_hot_deals_1, "Favorite Product ", "$130", "Added On : 13/03/2021"));
        favoriteProducts.add(new FavoriteProduct(R.drawable.img_hot_deals_2, "Favorite Product ", "$130", "Added On : 13/03/2021"));
        favoriteProducts.add(new FavoriteProduct(R.drawable.img_hot_deals_3, "Favorite Product ", "$130", "Added On : 13/03/2021"));
        favoriteProducts.add(new FavoriteProduct(R.drawable.img_hot_deals_4, "Favorite Product ", "$130", "Added On : 13/03/2021"));
        favoriteProducts.add(new FavoriteProduct(R.drawable.img_hot_deals_1, "Favorite Product ", "$130", "Added On : 13/03/2021"));
        favoriteProducts.add(new FavoriteProduct(R.drawable.img_hot_deals_2, "Favorite Product ", "$130", "Added On : 13/03/2021"));
        favoriteProducts.add(new FavoriteProduct(R.drawable.img_hot_deals_3, "Favorite Product ", "$130", "Added On : 13/03/2021"));
        favoriteProducts.add(new FavoriteProduct(R.drawable.img_hot_deals_4, "Favorite Product ", "$130", "Added On : 13/03/2021"));
        favoriteProducts.add(new FavoriteProduct(R.drawable.img_hot_deals_1, "Favorite Product ", "$130", "Added On : 13/03/2021"));
        favoriteProducts.add(new FavoriteProduct(R.drawable.img_hot_deals_2, "Favorite Product ", "$130", "Added On : 13/03/2021"));
        favoriteProducts.add(new FavoriteProduct(R.drawable.img_hot_deals_3, "Favorite Product ", "$130", "Added On : 13/03/2021"));
        favoriteProducts.add(new FavoriteProduct(R.drawable.img_hot_deals_4, "Favorite Product ", "$130", "Added On : 13/03/2021"));

        favoriteProductAdapter = new FavoriteProductAdapter(this.getContext(), favoriteProducts);
        recyclerFavoriteProducts.setAdapter(favoriteProductAdapter);
        layoutNoFavoriteProduct.setVisibility(View.GONE);
        recyclerFavoriteProducts.setVisibility(View.VISIBLE);
    }
}