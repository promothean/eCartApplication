package com.promothean.ecartapplication.adapter;

import android.content.Context;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextClock;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.promothean.ecartapplication.R;
import com.promothean.ecartapplication.model.Cart;

import java.util.List;

public class CartAdapter extends RecyclerView.Adapter<CartAdapter.ViewHolder> {
    private Context context;
    private List<Cart> carts;

    public CartAdapter(Context context, List<Cart> carts) {
        this.context = context;
        this.carts = carts;
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
    public CartAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.custom_cart_product_layout, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CartAdapter.ViewHolder holder, int position) {
        holder.layoutCartProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Cart", Toast.LENGTH_SHORT).show();
            }
        });
        holder.imgProduct.setImageResource(carts.get(position).getResID());
        holder.txtTitle.setText(carts.get(position).getTxtTitle());
        holder.txtWeight.setText(carts.get(position).getTxtWeight());
        holder.txtDiscountPrice.setText(carts.get(position).getTxtDiscountPrice());
        holder.txtOldPrice.setText(carts.get(position).getTxtOldPrice());
        holder.txtOldPrice.setPaintFlags(holder.txtOldPrice.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        holder.btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Less Quantity", Toast.LENGTH_SHORT).show();
            }
        });
        holder.txtQuantity.setText(carts.get(position).getTxtQuantity());
        holder.btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Add Quantity", Toast.LENGTH_SHORT).show();
            }
        });
        holder.btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Deleted", Toast.LENGTH_SHORT).show();
            }
        });
        holder.txtTotalPrice.setText(carts.get(position).getTxtTotalPrice());
    }

    @Override
    public int getItemCount() {
        return carts.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private LinearLayout layoutCartProduct;
        private ImageView imgProduct, btnDelete;
        private TextView txtTitle, txtWeight, txtDiscountPrice, txtOldPrice, btnMinus, txtQuantity, btnPlus, txtTotalPrice;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            layoutCartProduct = itemView.findViewById(R.id.layoutCartProduct);
            imgProduct = itemView.findViewById(R.id.imgProduct);
            txtTitle = itemView.findViewById(R.id.txtTitle);
            txtWeight = itemView.findViewById(R.id.txtWeight);
            txtDiscountPrice = itemView.findViewById(R.id.txtDiscountPrice);
            txtOldPrice = itemView.findViewById(R.id.txtOldPrice);
            btnMinus = itemView.findViewById(R.id.btnMinus);
            txtQuantity = itemView.findViewById(R.id.txtQuantity);
            btnPlus = itemView.findViewById(R.id.btnPlus);
            btnDelete = itemView.findViewById(R.id.btnDelete);
            txtTotalPrice = itemView.findViewById(R.id.txtTotalPrice);
        }
    }
}