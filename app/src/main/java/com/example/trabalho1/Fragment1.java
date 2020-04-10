package com.example.trabalho1;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragment1 extends Fragment {

    public Fragment1() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_1,null);
        TextView tv = view.findViewById(R.id.txtFrag1);
        tv.setText("Fragmento 1");
        return (view);
    }
}
