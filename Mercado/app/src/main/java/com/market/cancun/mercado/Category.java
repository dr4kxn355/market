package com.market.cancun.mercado;

import android.app.Fragment;
import android.app.LauncherActivity;
import android.content.Context;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.Arrays;

import java.util.ArrayList;
import java.util.List;

public class Category extends Fragment {

    public Category() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.activity_category, container, false);

    }


    private String lenguajeProgramacion[]=new String[]{"Java","PHP","Python","JavaScript","Ruby","C",
            "Go","Perl","Pascal"};

    private Integer[] imgid={
            R.drawable.ic_menu_camera,
            R.drawable.ic_menu_gallery,
            R.drawable.ic_menu_camera,
            R.drawable.ic_menu_send,
            R.drawable.ic_menu_camera,
            R.drawable.ic_menu_share,
            R.drawable.ic_menu_camera,
            R.drawable.ic_menu_slideshow,
            R.drawable.ic_menu_camera
    };

    private ListView lista;

    @Override
    public void onActivityCreated(Bundle bundle){
        super.onActivityCreated(bundle);

        Category_list adapter=new Category_list(getActivity(),lenguajeProgramacion,imgid);
        lista=(ListView)getView().findViewById(R.id.list);
        lista.setAdapter(adapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                android.app.FragmentManager fragmentManager = getFragmentManager();
                android.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                Post fragment = new Post();
                fragmentTransaction.replace(R.id.fragment, fragment);
                fragmentTransaction.commit();
            }
        });


    }
}
