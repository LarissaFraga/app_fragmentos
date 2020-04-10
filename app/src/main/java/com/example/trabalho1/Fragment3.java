package com.example.trabalho1;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

public class Fragment3 extends Fragment {
    private GridView gridView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final View view = inflater.inflate(R.layout.fragment_3, null);
       // setContentView(R.layout.fragment_3);
        //txtRaca = findViewById(R.id.txtRaca);
        gridView = view.findViewById(R.id.grid);

        int[] lista = new int[]{
                R.drawable.bambi, R.drawable.desenho_animado_pica_pau,
                R.drawable.garfield, R.drawable.hamtaro,
                R.drawable.malevola, R.drawable.img_200404,
                R.drawable.pinoquio, R.drawable.piupiu04a
        };
        gridView.setAdapter(new Adaptador(view.getContext(), lista));

        return (view);
    }

}
