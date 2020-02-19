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


public class InboxFragment extends Fragment {
    private TabLayout tabLayout;
    private ViewPager viewPager;

    public InboxFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_inbox, container, false);
        tabLayout = view.findViewById(R.id.tabLayoutIndexLayout);
        viewPager = view.findViewById(R.id.viewPagerIndexLayout);
        tabLayout.setupWithViewPager(viewPager);
        List<Fragment> fragmentList = new ArrayList<>();
        fragmentList.add(new CampaignsFragment());
        fragmentList.add(new NotificationsFragment());
        List<String> titleList = new ArrayList<>();
        titleList.add("CAMPAIGNS");
        titleList.add("NOTIFICATIONS");
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(fragmentList, titleList, getActivity().getSupportFragmentManager(), 1);
        viewPager.setAdapter(viewPagerAdapter);

        return view;
    }

}
