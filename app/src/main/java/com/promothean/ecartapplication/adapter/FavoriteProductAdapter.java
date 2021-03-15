package com.promothean.ecartapplication.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.promothean.ecartapplication.R;
import com.promothean.ecartapplication.model.FavoriteProduct;

import java.util.List;

public class FavoriteProductAdapter extends RecyclerView.Adapter<FavoriteProductAdapter.ViewHolder> {
    private Context context;
    private List<FavoriteProduct> favoriteProducts;

    public FavoriteProductAdapter(Context context, List<FavoriteProduct> favoriteProducts) {
        this.context = context;
        this.favoriteProducts = favoriteProducts;
        setHasStableIds(true);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

    @NonNull
    @Override
    public FavoriteProductAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.custom_favorite_product_layout, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FavoriteProductAdapter.ViewHolder holder, int position) {
        holder.layoutFavoriteProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Favorite Product", Toast.LENGTH_SHORT).show();
            }
        });
        holder.icIsFavorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Removed From Favorite", Toast.LENGTH_SHORT).show();
            }
        });
        holder.imgProduct.setImageResource(favoriteProducts.get(position).getResID());
        holder.txtTitle.setText(favoriteProducts.get(position).getTxtTitle());
        holder.txtPrice.setText(favoriteProducts.get(position).getTxtPrice());
        holder.txtDate.setText(favoriteProducts.get(position).getTxtDate());
    }

    @Override
    public int getItemCount() {
        return favoriteProducts.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private LinearLayout layoutFavoriteProduct;
        private ImageView imgProduct, icIsFavorite;
        private TextView txtTitle, txtPrice, txtDate;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            layoutFavoriteProduct = itemView.findViewById(R.id.layoutFavoriteProduct);
            imgProduct = itemView.findViewById(R.id.imgProduct);
            icIsFavorite = itemView.findViewById(R.id.icIsFavorite);
            txtTitle = itemView.findViewById(R.id.txtTitle);
            txtPrice = itemView.findViewById(R.id.txtPrice);
            txtDate = itemView.findViewById(R.id.txtDate);
        }
    }
}