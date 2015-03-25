package com.universidadcauca.movil.tfragments;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.universidadcauca.movil.tfragments.fragments.ColorFragment;

public class MainActivity extends ActionBarActivity {

    ColorFragment azul;
    ColorFragment violeta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        azul =  new ColorFragment();
        azul.init(ColorFragment.AZUL);

        violeta = new ColorFragment();
        violeta.init(ColorFragment.VIOLETA);

        FrameLayout container2 = (FrameLayout)
                findViewById(R.id.container2);

        FragmentTransaction ft = getSupportFragmentManager()
                .beginTransaction();

        ft.replace(R.id.container1, azul);

        if(container2!=null)
            ft.replace(R.id.container2,violeta);

        ft.commit();

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
