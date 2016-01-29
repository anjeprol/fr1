package com.example.prolan.fr1;


import android.app.Fragment;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class f2 extends Fragment {


    TextView tV;
    View v;
    public f2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_f2, container, false);
        tV = (TextView)v.findViewById(R.id.txtV);
        return v;
    }

    public void setFText(String mssg){
        tV.setText(mssg);
    }

}
