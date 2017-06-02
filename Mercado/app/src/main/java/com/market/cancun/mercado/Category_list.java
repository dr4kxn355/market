package com.market.cancun.mercado;

import android.widget.ArrayAdapter;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by dr4kxn355 on 1/06/17.
 */

public class Category_list extends ArrayAdapter<String>{
    private final Activity context;
    private final String[] itemname;
    private final Integer[] integers;

    public Category_list(Activity context, String[] itemname, Integer[] integers) {
        super(context, R.layout.activity_category_list, itemname);
        // TODO Auto-generated constructor stub

        this.context=context;
        this.itemname=itemname;
        this.integers=integers;
    }

    public View getView(int posicion,View view, ViewGroup parent){

        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.activity_category_list,null,true);

        TextView txtTitle = (TextView) rowView.findViewById(R.id.texto_principal);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
        TextView etxDescripcion = (TextView) rowView.findViewById(R.id.texto_secundario);

        txtTitle.setText(itemname[posicion]);
        imageView.setImageResource(integers[posicion]);
        etxDescripcion.setText("Description "+itemname[posicion]);

        return rowView;
    }
}
