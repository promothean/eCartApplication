package com.promothean.ecartapplication.navfragments;

import android.os.Bundle;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.promothean.ecartapplication.R;
import com.promothean.ecartapplication.adapter.CategoryAdapter;
import com.promothean.ecartapplication.adapter.HotProductAdapter;
import com.promothean.ecartapplication.adapter.NewArrivedAdapter;
import com.promothean.ecartapplication.adapter.SliderSlideAdapter;
import com.promothean.ecartapplication.adapter.TrendingProductAdapter;
import com.promothean.ecartapplication.model.Category;
import com.promothean.ecartapplication.model.HotProduct;
import com.promothean.ecartapplication.model.NewArrived;
import com.promothean.ecartapplication.model.SliderSlide;
import com.promothean.ecartapplication.model.Trending;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment<runnable> extends Fragment {
    private static final String TAG = "HomeFragment";
    private ViewPager viewPager;
    private LinearLayout sliderDots;
    private SliderSlideAdapter sliderSlideAdapter;
    private List<SliderSlide> sliderSlides;
    private int dotsCount;
    private ImageView[] dotsImages;

    //Auto Scroll ViewPager
    private static final int DELAY = 3000;
    private int currentPage = 0;
    private final Handler handler = new Handler();
    Runnable runnable = new Runnable() {
        public void run() {
            if (viewPager.getCurrentItem() == sliderSlides.size() - 1) {
                currentPage = 0;
            } else {
                currentPage++;
            }
            viewPager.setCurrentItem(currentPage);
            handler.postDelayed(runnable, DELAY);
        }
    };

    private RecyclerView recyclerCategories, recyclerHotProducts, recyclerNewArrived;
    private GridView gridTrendingProducts;
    private CategoryAdapter categoryAdapter;
    private HotProductAdapter hotProductAdapter;
    private TrendingProductAdapter trendingProductAdapter;
    private NewArrivedAdapter arrivedAdapter;
    private List<Category> categories;
    private List<HotProduct> hotProducts;
    private List<Trending> trendingProducts;
    private List<NewArrived> newArrivedProducts;

    public HomeFragment() { }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        viewPager = view.findViewById(R.id.viewPager);
        sliderDots = view.findViewById(R.id.sliderDots);
        recyclerCategories = view.findViewById(R.id.recyclerCategories);
        recyclerHotProducts = view.findViewById(R.id.recyclerHotProducts);
        recyclerNewArrived = view.findViewById(R.id.recyclerNewArrived);
        gridTrendingProducts = view.findViewById(R.id.gridTrendingProducts);

        //BackEnd Code
        loadSliderSlides();
        loadCategories();
        loadHotProducts();
        loadTrendingProducts();
        loadNewArrivedProducts();

        return view;
    }

    private void loadNewArrivedProducts() {
        newArrivedProducts = new ArrayList<>();

        newArrivedProducts.add(new NewArrived(R.drawable.img_new_arrival_1, "New Arrival", "$100"));
        newArrivedProducts.add(new NewArrived(R.drawable.img_new_arrival_2, "New Arrival", "$100"));
        newArrivedProducts.add(new NewArrived(R.drawable.img_new_arrival_3, "New Arrival", "$100"));
        newArrivedProducts.add(new NewArrived(R.drawable.img_new_arrival_1, "New Arrival", "$100"));
        newArrivedProducts.add(new NewArrived(R.drawable.img_new_arrival_2, "New Arrival", "$100"));
        newArrivedProducts.add(new NewArrived(R.drawable.img_new_arrival_3, "New Arrival", "$100"));

        arrivedAdapter = new NewArrivedAdapter(this.getContext(), newArrivedProducts);
        recyclerNewArrived.setAdapter(arrivedAdapter);
    }

    private void loadTrendingProducts() {
        trendingProducts = new ArrayList<>();

        trendingProducts.add(new Trending(R.drawable.img_trending_1, "Trending Product"));
        trendingProducts.add(new Trending(R.drawable.img_trending_2, "Trending Product"));
        trendingProducts.add(new Trending(R.drawable.img_trending_3, "Trending Product"));
        trendingProducts.add(new Trending(R.drawable.img_trending_1, "Trending Product"));
        trendingProducts.add(new Trending(R.drawable.img_trending_2, "Trending Product"));
        trendingProducts.add(new Trending(R.drawable.img_trending_3, "Trending Product"));

        trendingProductAdapter = new TrendingProductAdapter(this.getContext(), trendingProducts);
        gridTrendingProducts.setAdapter(trendingProductAdapter);
    }

    private void loadHotProducts() {
        hotProducts = new ArrayList<>();

        hotProducts.add(new HotProduct(R.drawable.img_hot_deals_1, "Himalaya Baby", "$130"));
        hotProducts.add(new HotProduct(R.drawable.img_hot_deals_2, "Johnson's Baby", "$100"));
        hotProducts.add(new HotProduct(R.drawable.img_hot_deals_3, "Prickly Heat", "$90"));
        hotProducts.add(new HotProduct(R.drawable.img_hot_deals_4, "Seba Med Baby", "$20"));
        hotProducts.add(new HotProduct(R.drawable.img_hot_deals_1, "Himalaya Baby", "$130"));
        hotProducts.add(new HotProduct(R.drawable.img_hot_deals_2, "Johnson's Baby", "$100"));
        hotProducts.add(new HotProduct(R.drawable.img_hot_deals_3, "Prickly Heat", "$90"));
        hotProducts.add(new HotProduct(R.drawable.img_hot_deals_4, "Seba Med Baby", "$20"));

        hotProductAdapter = new HotProductAdapter(this.getContext(), hotProducts);
        recyclerHotProducts.setAdapter(hotProductAdapter);
    }

    private void loadCategories() {
        categories = new ArrayList<>();

        categories.add(new Category(R.drawable.ic_cat_baby_needs, "Baby Needs"));
        categories.add(new Category(R.drawable.ic_cat_home_supplies, "Home Supplies"));
        categories.add(new Category(R.drawable.ic_cat_instant_foods, "Instant Foods"));
        categories.add(new Category(R.drawable.ic_cat_grocery, "Grocery"));
        categories.add(new Category(R.drawable.ic_cat_beverages, "Beverages"));
        categories.add(new Category(R.drawable.ic_cat_cakes, "Cakes"));

        categoryAdapter = new CategoryAdapter(this.getContext(), categories);
        recyclerCategories.setAdapter(categoryAdapter);
    }

    private void loadSliderSlides() {
        sliderSlides = new ArrayList<>();

        sliderSlides.add(new SliderSlide(R.drawable.img_slider_1));
        sliderSlides.add(new SliderSlide(R.drawable.img_slider_2));
        sliderSlides.add(new SliderSlide(R.drawable.img_slider_3));
        sliderSlides.add(new SliderSlide(R.drawable.img_slider_4));

        dotsCount = sliderSlides.size();
        dotsImages = new ImageView[dotsCount];

        for(int i=0; i<dotsCount; i++) {
            dotsImages[i] = new ImageView(this.getContext());
            dotsImages[i].setImageDrawable(ContextCompat.getDrawable(this.getContext(), R.drawable.inactive_slider_dot));
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
            params.setMargins(8, 0, 8, 0);
            sliderDots.addView(dotsImages[i], params);
        }
        dotsImages[0].setImageDrawable(ContextCompat.getDrawable(this.getContext(), R.drawable.active_slider_dot));

        sliderSlideAdapter = new SliderSlideAdapter(this.getContext(), sliderSlides);
        viewPager.setAdapter(sliderSlideAdapter);

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                for(int i=0; i<dotsCount; i++){
                    dotsImages[i].setImageDrawable(ContextCompat.getDrawable(getContext(), R.drawable.inactive_slider_dot));
                }
                dotsImages[position].setImageDrawable(ContextCompat.getDrawable(getContext(), R.drawable.active_slider_dot));
                currentPage = position;
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    @Override
    public void onResume() {
        super.onResume();
        handler.postDelayed(runnable, DELAY);
    }

    @Override
    public void onPause() {
        super.onPause();
        handler.removeCallbacks(runnable);
    }
}