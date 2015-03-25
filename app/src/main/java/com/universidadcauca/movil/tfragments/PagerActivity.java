package com.universidadcauca.movil.tfragments;

import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.universidadcauca.movil.tfragments.adapters.ColorAdapter;
import com.universidadcauca.movil.tfragments.fragments.ColorFragment;

import java.util.ArrayList;
import java.util.List;


public class PagerActivity extends ActionBarActivity {

    ViewPager pager;
    List<ColorFragment> data;
    ColorAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pager);

        pager = (ViewPager) findViewById(R.id.pager);

        data = new ArrayList<>();

        for(int i = 0; i<6;i++){
            ColorFragment c =  new ColorFragment();
            c.init(i);
            data.add(c);
        }

        adapter= new ColorAdapter(
                getSupportFragmentManager()
                , data);

        pager.setAdapter(adapter);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_pager, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
