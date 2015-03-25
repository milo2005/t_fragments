package com.universidadcauca.movil.tfragments.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.universidadcauca.movil.tfragments.fragments.ColorFragment;

import java.util.List;

/**
 * Created by DarioFernando on 24/03/2015.
 */
public class ColorAdapter extends FragmentPagerAdapter {

    List<ColorFragment> data;


    public ColorAdapter(FragmentManager fm
            , List<ColorFragment> data) {
        super(fm);
        this.data = data;
    }

    @Override
    public Fragment getItem(int position) {
        return data.get(position);
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "Pagina "+position;
    }
}
