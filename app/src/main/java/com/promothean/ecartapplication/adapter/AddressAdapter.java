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
import com.promothean.ecartapplication.model.Address;
import com.google.android.material.chip.Chip;

import java.net.ContentHandler;
import java.util.List;

public class AddressAdapter extends RecyclerView.Adapter<AddressAdapter.ViewHolder> {
    private Context context;
    private List<Address> addresses;

    public AddressAdapter(Context context, List<Address> addresses) {
        this.context = context;
        this.addresses = addresses;
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
    public AddressAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.custom_address_layout, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AddressAdapter.ViewHolder holder, int position) {
        holder.layoutAddress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Address", Toast.LENGTH_SHORT).show();
            }
        });
        if (addresses.get(position).getChecked()) {
            holder.btnIsChecked.setImageResource(R.drawable.ic_checked_address);
        } else {
            holder.btnIsChecked.setImageResource(R.drawable.ic_unchecked_address);
        }
        holder.btnIsChecked.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (addresses.get(position).getChecked()) {
                    holder.btnIsChecked.setImageResource(R.drawable.ic_unchecked_address);
                    addresses.get(position).setChecked(false);
                } else {
                    holder.btnIsChecked.setImageResource(R.drawable.ic_checked_address);
                    addresses.get(position).setChecked(true);
                }
            }
        });
        holder.txtUserName.setText(addresses.get(position).getTxtUserName());
        holder.txtPhoneNo.setText(addresses.get(position).getTxtPhoneNo());
        if (addresses.get(position).getDefault()) {
            holder.chipDefault.setVisibility(View.VISIBLE);
        } else {
            holder.chipDefault.setVisibility(View.GONE);
        }
        if (addresses.get(position).getHomeOrOffice()) {
            holder.chipHomeOffice.setVisibility(View.VISIBLE);
            holder.chipHomeOffice.setText(addresses.get(position).getTxtHomeOrOffice());
        } else {
            holder.chipHomeOffice.setVisibility(View.GONE);
        }
        holder.btnEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Edit", Toast.LENGTH_SHORT).show();
            }
        });
        holder.btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Delete", Toast.LENGTH_SHORT).show();
            }
        });
        holder.txtAddress.setText(addresses.get(position).getTxtAddress());
    }

    @Override
    public int getItemCount() {
        return addresses.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private LinearLayout layoutAddress;
        private ImageView btnIsChecked;
        private TextView txtUserName;
        private TextView txtPhoneNo;
        private Chip chipDefault;
        private Chip chipHomeOffice;
        private ImageView btnEdit;
        private ImageView btnDelete;
        private TextView txtAddress;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            layoutAddress = itemView.findViewById(R.id.layoutAddress);
            btnIsChecked = itemView.findViewById(R.id.btnIsChecked);
            txtUserName = itemView.findViewById(R.id.txtUserName);
            txtPhoneNo = itemView.findViewById(R.id.txtPhoneNo);
            chipDefault = itemView.findViewById(R.id.chipDefault);
            chipHomeOffice = itemView.findViewById(R.id.chipHomeOffice);
            btnEdit = itemView.findViewById(R.id.btnEdit);
            btnDelete = itemView.findViewById(R.id.btnDelete);
            txtAddress = itemView.findViewById(R.id.txtAddress);
        }
    }
}