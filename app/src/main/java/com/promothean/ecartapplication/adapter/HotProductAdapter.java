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
import com.promothean.ecartapplication.model.HotProduct;

import org.w3c.dom.Text;

import java.util.List;

public class HotProductAdapter extends RecyclerView.Adapter<HotProductAdapter.ViewHolder> {
    private Context context;
    private List<HotProduct> hotProducts;

    public HotProductAdapter(Context context, List<HotProduct> hotProducts) {
        this.context = context;
        this.hotProducts = hotProducts;
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
    public HotProductAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.custom_hot_deal_layout, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HotProductAdapter.ViewHolder holder, int position) {
        holder.layoutHotProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Hot Product", Toast.LENGTH_SHORT).show();
            }
        });
        holder.imgProduct.setImageResource(hotProducts.get(position).getImgRes());
        holder.txtTitle.setText(hotProducts.get(position).getTxtTitle());
        holder.txtPrice.setText(hotProducts.get(position).getTxtPrice());
    }

    @Override
    public int getItemCount() {
        return hotProducts.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private LinearLayout layoutHotProduct;
        private ImageView imgProduct;
        private TextView txtTitle, txtPrice;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            layoutHotProduct = itemView.findViewById(R.id.layoutHotDealProduct);
            imgProduct = itemView.findViewById(R.id.imgProduct);
            txtTitle = itemView.findViewById(R.id.txtTitle);
            txtPrice = itemView.findViewById(R.id.txtPrice);
        }
    }
}