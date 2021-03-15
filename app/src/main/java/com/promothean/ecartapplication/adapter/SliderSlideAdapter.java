package com.promothean.ecartapplication.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.promothean.ecartapplication.R;
import com.promothean.ecartapplication.model.SliderSlide;

import java.util.List;

public class SliderSlideAdapter extends PagerAdapter {
    private Context context;
    private List<SliderSlide> sliderSlides;

    public SliderSlideAdapter(Context context, List<SliderSlide> sliderSlides) {
        this.context = context;
        this.sliderSlides = sliderSlides;
    }

    @Override
    public int getCount() {
        return sliderSlides.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View view = LayoutInflater.from(context).inflate(R.layout.custom_slider_layout, null);

        ImageView imgSlider = view.findViewById(R.id.imgSlider);
        imgSlider.setImageResource(sliderSlides.get(position).getImgRes());

        ViewPager viewPager = (ViewPager) container;
        viewPager.addView(view);

        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        ViewPager viewPager = (ViewPager) container;
        View view = (View) object;

        viewPager.removeView(view);
    }
}