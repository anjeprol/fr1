package com.example.prolan.fr1;


import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class f1 extends Fragment implements View.OnClickListener {

    View v;
    Button b1,b2;
    String iX;

    public f1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_f1, container, false);
        b1 = (Button)v.findViewById(R.id.btn1);
        b1.setOnClickListener(this);
        b2 = (Button)v.findViewById(R.id.btn2);
        b2.setOnClickListener(this);
        return v;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn1:
                iX = "Button 1";
                break;
            case R.id.btn2:
                iX = "Button 2";
                break;
        }
        //Call
        Activity act = getActivity();
        FrCoo coo = (FrCoo)act;
        coo.btnClicked(iX);
    }
}
