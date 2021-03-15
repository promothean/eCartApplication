package com.promothean.ecartapplication.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.promothean.ecartapplication.R;

public class SliderItemFragment extends Fragment {
    private static final String ARG_POSITION = "slider-position";
    private static final int[] BG_IMAGE = new int[]{R.color.white, R.color.white, R.color.white};
    private static final int[] PAGE_IMAGE = new int[]{R.drawable.intro_a, R.drawable.intro_b, R.drawable.intro_c};
    private static final int[] PAGE_TEXT = new int[]{R.string.intro_text_a, R.string.intro_text_b, R.string.intro_text_c};
    private static final int[] PAGE_TITLES = new int[]{R.string.intro_title_a, R.string.intro_title_b, R.string.intro_title_c};
    private int position;

    public static SliderItemFragment newInstance(int position) {
        SliderItemFragment sliderItemFragment = new SliderItemFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("slider-position", position);
        sliderItemFragment.setArguments(bundle);
        return sliderItemFragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (this.getArguments() != null) {
            this.position = this.getArguments().getInt("slider-position");
        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_slider_item, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        view.setBackground(requireActivity().getDrawable(BG_IMAGE[position]));
        ImageView imgSlider = view.findViewById(R.id.imgSlider);
        TextView txtTitle = view.findViewById(R.id.txtTitle);
        TextView txtText = view.findViewById(R.id.txtText);
        imgSlider.setImageResource(PAGE_IMAGE[position]);
        txtTitle.setText(PAGE_TITLES[position]);
        txtText.setText(PAGE_TEXT[position]);
    }
}