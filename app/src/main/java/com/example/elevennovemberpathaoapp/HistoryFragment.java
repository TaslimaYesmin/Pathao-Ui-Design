package com.example.elevennovemberpathaoapp;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;


public class HistoryFragment extends Fragment {
    private TabLayout tabLayout;
    private ViewPager viewPager;

    public HistoryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_history, container, false);
        tabLayout = view.findViewById(R.id.tabLayoutHistoryLayout);
        viewPager = view.findViewById(R.id.viewPagerHistoryLayout);
        tabLayout.setupWithViewPager(viewPager);

        List<Fragment> fragmentList = new ArrayList<>();
        fragmentList.add(new BikeFragment());
        fragmentList.add(new CarFragment());
        fragmentList.add(new FoodFragment());
        fragmentList.add(new ParcelFragment());

        List<String> titleList = new ArrayList<>();
        titleList.add("BIKE");
        titleList.add("CAR");
        titleList.add("FOOD");
        titleList.add("PARCEL");

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(fragmentList, titleList, getActivity().getSupportFragmentManager(), 1);
        viewPager.setAdapter(viewPagerAdapter);
        return view;
    }

}
