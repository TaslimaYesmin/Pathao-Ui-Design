package com.example.elevennovemberpathaoapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {
    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
        fragmentReplace(new HomeFragment());

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.homeMenu) {
            fragmentReplace(new HomeFragment());
            return true;
        } else if (menuItem.getItemId() == R.id.inboxMenu) {
            fragmentReplace(new InboxFragment());
            return true;
        } else if (menuItem.getItemId() == R.id.historyMenu) {
            fragmentReplace(new HistoryFragment());
            return true;
        } else if (menuItem.getItemId() == R.id.moreMenu) {
            fragmentReplace(new MoreFragment());
            return true;
        }


        return false;
    }

    private void fragmentReplace(Fragment fragment) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.frameLayout, fragment);
        ft.commit();
    }
}
