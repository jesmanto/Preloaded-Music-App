package com.example.musicapp.adapters;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.musicapp.ui.AlbumFragment;
import com.example.musicapp.ui.SongsFragment;

import java.util.ArrayList;

public class ViewPagerAdapter extends FragmentStateAdapter {

    public ViewPagerAdapter(@NonNull FragmentManager fm, Lifecycle lifecycle) {
        super(fm,lifecycle);

    }


//    public ViewPagerAdapter(@NonNull FragmentManager fm) {
//        super(fm);
//        this.fragments = new ArrayList<>();
//        this.titles = new ArrayList<>();
//    }
//    public ViewPagerAdapter()

//    public void addFragments(Fragment fragment, String title){
//        fragments.add(fragment);
//        titles.add(title);
//    }

//    @NonNull
//    @Override
//    public Fragment getItem(int position) {
//        return fragments.get(position);
//    }
//
//    @Override
//    public int getCount() {
//        return fragments.size();
//    }
//
//    @Nullable
//    @Override
//    public CharSequence getPageTitle(int position) {
//        return titles.get(position);
//    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        Fragment fragment;
        switch(position){
            case 0:
                fragment = new AlbumFragment();
                break;
            case 1 :
                fragment = new SongsFragment();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + position);
        };
        return fragment;
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
