package com.universidadcauca.movil.tfragments.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.universidadcauca.movil.tfragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ColorFragment extends Fragment {

    public static final int AZUL = 0;
    public static final int AMARILLO = 1;
    public static final int ROJO = 2;
    public static final int VERDE = 3;
    public static final int VIOLETA = 4;
    public static final int NARANJA = 5;


    int posColor;

    public ColorFragment() {
        // Required empty public constructor
    }

    public void init(int posColor){
        this.posColor= posColor;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_color,
                container, false);
        TextView txt = (TextView) v.findViewById(R.id.txt);

        String[] colores = getResources()
                .getStringArray(R.array.colores);
        txt.setText(colores[posColor]);

        int[] coloresV = getResources()
                .getIntArray(R.array.colores_valor);
        v.setBackgroundColor(coloresV[posColor]);


        return v;
    }


}
