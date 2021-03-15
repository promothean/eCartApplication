package com.promothean.ecartapplication.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.promothean.ecartapplication.R;
import com.promothean.ecartapplication.model.Order;

import java.util.List;

public class OrderAdapter extends RecyclerView.Adapter<OrderAdapter.ViewHolder> {
    private Context context;
    private List<Order> orders;

    public OrderAdapter(Context context, List<Order> orders) {
        this.context = context;
        this.orders = orders;
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
    public OrderAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.custom_order_layout, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull OrderAdapter.ViewHolder holder, int position) {
        holder.layoutOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Order", Toast.LENGTH_SHORT).show();
            }
        });
        holder.txtOrderNo.setText(orders.get(position).getTxtOrderNo());
        holder.txtNoItems.setText(orders.get(position).getTxtNoItems());
        holder.txtItems.setText(orders.get(position).getTxtItems());
        holder.txtCategory.setText(orders.get(position).getTxtCategory());
        if (orders.get(position).getTxtCategory() == "In-Process") {
            holder.txtCategory.setBackgroundResource(R.color.colorOrderInProcess);
        } else if (orders.get(position).getTxtCategory() == "Shipped") {
            holder.txtCategory.setBackgroundResource(R.color.colorOrderShipped);
        } else if (orders.get(position).getTxtCategory() == "Delivered") {
            holder.txtCategory.setBackgroundResource(R.color.colorOrderDelivered);
        } else if (orders.get(position).getTxtCategory() == "Cancelled") {
            holder.txtCategory.setBackgroundResource(R.color.colorOrderCanceled);
        } else if (orders.get(position).getTxtCategory() == "Returned") {
            holder.txtCategory.setBackgroundResource(R.color.colorOrderReturned);
        }
        holder.txtLinkViewDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "View Details", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return orders.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private LinearLayout layoutOrder;
        private TextView txtOrderNo, txtNoItems, txtItems, txtCategory, txtDate, txtAmount, txtLinkViewDetails;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            layoutOrder = itemView.findViewById(R.id.layoutOrder);
            txtOrderNo = itemView.findViewById(R.id.txtOrderNo);
            txtNoItems = itemView.findViewById(R.id.txtNoItems);
            txtItems = itemView.findViewById(R.id.txtItems);
            txtCategory = itemView.findViewById(R.id.txtCategory);
            txtDate = itemView.findViewById(R.id.txtDate);
            txtAmount = itemView.findViewById(R.id.txtAmount);
            txtLinkViewDetails = itemView.findViewById(R.id.txtLinkViewDetails);
        }
    }
}