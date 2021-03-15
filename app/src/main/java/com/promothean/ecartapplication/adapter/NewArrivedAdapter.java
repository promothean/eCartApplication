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
import com.promothean.ecartapplication.model.NewArrived;

import java.util.List;

public class NewArrivedAdapter extends RecyclerView.Adapter<NewArrivedAdapter.ViewHolder> {
    private Context context;
    private List<NewArrived> newArrivedProducts;

    public NewArrivedAdapter(Context context, List<NewArrived> newArrivedProducts) {
        this.context = context;
        this.newArrivedProducts = newArrivedProducts;
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
    public NewArrivedAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.custom_new_arrived_layout, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NewArrivedAdapter.ViewHolder holder, int position) {
        holder.layoutNewArrived.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "New Arrived", Toast.LENGTH_SHORT).show();
            }
        });
        holder.imgProduct.setImageResource(newArrivedProducts.get(position).getResID());
        holder.txtTitle.setText(newArrivedProducts.get(position).getTxtTitle());
        holder.txtPrice.setText(newArrivedProducts.get(position).getTxtPrice());
    }

    @Override
    public int getItemCount() {
        return newArrivedProducts.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private LinearLayout layoutNewArrived;
        private ImageView imgProduct;
        private TextView txtTitle, txtPrice;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            layoutNewArrived = itemView.findViewById(R.id.layoutNewArrived);
            imgProduct = itemView.findViewById(R.id.imgProduct);
            txtTitle = itemView.findViewById(R.id.txtTitle);
            txtPrice = itemView.findViewById(R.id.txtPrice);
        }
    }
}