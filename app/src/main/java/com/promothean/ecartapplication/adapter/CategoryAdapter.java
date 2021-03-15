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
import com.promothean.ecartapplication.model.Category;

import java.util.List;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.ViewHolder> {
    private Context context;
    private List<Category> categories;

    public CategoryAdapter(Context context, List<Category> categories) {
        this.context = context;
        this.categories = categories;
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
    public CategoryAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.custom_category_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryAdapter.ViewHolder holder, int position) {
        holder.layoutCategory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Category", Toast.LENGTH_SHORT).show();
            }
        });
        holder.icCategory.setImageResource(categories.get(position).getImgRes());
        holder.txtCategory.setText(categories.get(position).getTxtTagLine());
    }

    @Override
    public int getItemCount() {
        return categories.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private LinearLayout layoutCategory;
        private ImageView icCategory;
        private TextView txtCategory;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            layoutCategory = itemView.findViewById(R.id.layoutCategory);
            icCategory = itemView.findViewById(R.id.icCategory);
            txtCategory = itemView.findViewById(R.id.txtCategory);
        }
    }
}