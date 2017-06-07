package com.market.cancun.mercado;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Ventas extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.activity_ventas, container, false);

    }


    @Override
    public void onActivityCreated(Bundle bundle){
        super.onActivityCreated(bundle);
    }
}
