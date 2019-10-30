package com.moringaschool.myrestaurants.adapters;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.moringaschool.myrestaurants.models.Business;
import com.moringaschool.myrestaurants.models.Restaurant;
import com.moringaschool.myrestaurants.ui.RestaurantDetailFragment;

import java.util.ArrayList;
import java.util.List;

public class RestaurantPagerAdapter extends FragmentPagerAdapter {
    private List<Business> mRestaurants;
    //private List<Restaurant> mRestaurants;
    public RestaurantPagerAdapter(FragmentManager fm, List<Business> restaurants) {
        super(fm);
        mRestaurants = restaurants;
    }
    //    public RestaurantPagerAdapter(FragmentManager fm, List<Restaurant> restaurants) {
//        super(fm);
//        mRestaurants = restaurants;
//    }
    @Override
    public Fragment getItem(int position) {
        return RestaurantDetailFragment.newInstance(mRestaurants.get(position));
    }
    @Override
    public int getCount() {
        return mRestaurants.size();
    }
}
