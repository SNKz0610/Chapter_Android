package com.example.testing.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.testing.fragment.FragmentDetail;
import com.example.testing.fragment.FragmentRespositories;

public class FragmentAdapter extends FragmentStatePagerAdapter {
    private FragmentDetail fragmentDetail;
    private FragmentRespositories fragmentRespositories;

    public FragmentAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new FragmentRespositories();
            case 1:
                return new FragmentDetail();
            default:
                return new FragmentRespositories();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = "";
        switch (position){
            case 0:
               title = "Respositories";
               break;
            case 1:
                title = "Detail";
                break;
            default:
                title = "Respositories";
                break;
        }
        return title;
    }
}
