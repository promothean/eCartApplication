package com.promothean.ecartapplication.navfragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.promothean.ecartapplication.R;
import com.promothean.ecartapplication.orders.OrdersFragment;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class TrackOrderFragment extends Fragment {
    private TabLayout tabLayoutTabs;
    private ViewPager viewPagerTabs;

    public TrackOrderFragment() { }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_track_order, container, false);

        tabLayoutTabs = view.findViewById(R.id.tabLayoutTabs);
        viewPagerTabs = view.findViewById(R.id.viewPagerTabs);

        //Back End Coding
        setUpViewPager(viewPagerTabs);
        tabLayoutTabs.setupWithViewPager(viewPagerTabs);

        return view;
    }

    private void setUpViewPager(ViewPager viewPager) {
        ViewPageAdapter viewPageAdapter = new ViewPageAdapter(getActivity().getSupportFragmentManager());
        viewPageAdapter.addFragment(new OrdersFragment("All"), "All");
        viewPageAdapter.addFragment(new OrdersFragment("In-Process"), "In-Process");
        viewPageAdapter.addFragment(new OrdersFragment("Shipped"), "Shipped");
        viewPageAdapter.addFragment(new OrdersFragment("Delivered"), "Delivered");
        viewPageAdapter.addFragment(new OrdersFragment("Cancelled"), "Cancelled");
        viewPageAdapter.addFragment(new OrdersFragment("Returned"), "Returned");
        viewPager.setAdapter(viewPageAdapter);
    }

    static class ViewPageAdapter extends FragmentPagerAdapter {
        private final List<Fragment> fragmentList = new ArrayList<>();
        private final List<String> stringList = new ArrayList<>();

        public ViewPageAdapter(@NonNull FragmentManager fm) {
            super(fm);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            return fragmentList.get(position);
        }

        @Override
        public int getCount() {
            return fragmentList.size();
        }

        public void addFragment(Fragment fragment, String title) {
            fragmentList.add(fragment);
            stringList.add(title);
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return stringList.get(position);
        }
    }
}