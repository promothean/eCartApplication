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
import com.promothean.ecartapplication.model.Categories;

import java.util.List;

public class CategoriesAdapter extends BaseAdapter {
    private Context context;
    private List<Categories> categories;

    public CategoriesAdapter(Context context, List<Categories> categories) {
        this.context = context;
        this.categories = categories;
    }

    @Override
    public int getCount() {
        return categories.size();
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
        convertView = LayoutInflater.from(context).inflate(R.layout.custom_categories_layout, parent, false);

        LinearLayout layoutCategories = convertView.findViewById(R.id.layoutCategories);
        ImageView icCategories = convertView.findViewById(R.id.icCategories);
        TextView txtCategories = convertView.findViewById(R.id.txtCategories);

        layoutCategories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Category", Toast.LENGTH_SHORT).show();
            }
        });
        icCategories.setImageResource(categories.get(position).getImgRes());
        txtCategories.setText(categories.get(position).getTxtTagLine());

        return convertView;
    }
}