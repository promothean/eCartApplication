package com.promothean.ecartapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.promothean.ecartapplication.adapter.SliderPagerAdapter;
import com.promothean.ecartapplication.loginsignup.LoginActivity;
import com.google.android.material.tabs.TabLayout;

public class IntroActivity extends AppCompatActivity implements View.OnClickListener, ViewPager.OnPageChangeListener {
    private static final String TAG = "IntroActivity";
    private Button btnNext;
    private TextView txtSkip;
    private ViewPager pagerIntroSlider;
    private TabLayout layoutTabs;
    private SliderPagerAdapter sliderPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        btnNext = findViewById(R.id.btnNext);
        txtSkip = findViewById(R.id.txtSkip);
        layoutTabs = findViewById(R.id.layoutTabs);
        pagerIntroSlider = findViewById(R.id.pagerIntroSlider);

        sliderPagerAdapter = new SliderPagerAdapter(getSupportFragmentManager(), 1);
        pagerIntroSlider.setAdapter(sliderPagerAdapter);
        layoutTabs.setupWithViewPager(pagerIntroSlider);

        btnNext.setOnClickListener(this);
        txtSkip.setOnClickListener(this);
        pagerIntroSlider.addOnPageChangeListener(this);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnNext:
                if (pagerIntroSlider.getCurrentItem() + 1 < sliderPagerAdapter.getCount()) {
                    pagerIntroSlider.setCurrentItem(pagerIntroSlider.getCurrentItem() + 1);
                } else {
                    startActivity(new Intent(IntroActivity.this, LoginActivity.class));
                    finish();
                }
                break;

            case R.id.txtSkip:
                startActivity(new Intent(IntroActivity.this, LoginActivity.class));
                finish();
                break;
        }
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
    }

    @Override
    public void onPageSelected(int position) {
        if (position == sliderPagerAdapter.getCount() - 1) {
            btnNext.setText("Get Started");
        } else {
            btnNext.setText("Next");
        }
    }

    @Override
    public void onPageScrollStateChanged(int state) {
    }
}