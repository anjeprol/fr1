package com.example.prolan.fr1;

import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements FrCoo {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void btnClicked(String mssg) {
        FragmentManager fm = getFragmentManager();
        f2 frg = (f2) fm.findFragmentById(R.id.f2);
        frg.setFText(mssg);
    }
}
