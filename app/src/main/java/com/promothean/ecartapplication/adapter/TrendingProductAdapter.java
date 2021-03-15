package com.promothean.ecartapplication.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.promothean.ecartapplication.R;
import com.promothean.ecartapplication.model.Trending;

import java.util.List;

public class TrendingProductAdapter extends BaseAdapter {
    private Context context;
    private List<Trending> trendingProducts;

    public TrendingProductAdapter(Context context, List<Trending> trendingProducts) {
        this.context = context;
        this.trendingProducts = trendingProducts;
    }

    @Override
    public int getCount() {
        return trendingProducts.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @SuppressLint("ViewHolder")
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(context).inflate(R.layout.custom_trending_product_layout, parent, false);

        LinearLayout layoutTrendingProduct;
        ImageView imgProduct;
        TextView txtTitle;

        layoutTrendingProduct = convertView.findViewById(R.id.layoutTrendingProduct);
        imgProduct = convertView.findViewById(R.id.imgProduct);
        txtTitle = convertView.findViewById(R.id.txtTitle);

        layoutTrendingProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Trending Product", Toast.LENGTH_SHORT).show();
            }
        });
        imgProduct.setImageResource(trendingProducts.get(position).getResID());
        txtTitle.setText(trendingProducts.get(position).getTxtTitle());

        return convertView;
    }
}