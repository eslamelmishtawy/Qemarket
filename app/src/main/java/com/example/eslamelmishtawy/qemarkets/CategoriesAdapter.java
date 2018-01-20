package com.example.eslamelmishtawy.qemarkets;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import java.util.ArrayList;

/**
 * Created by Eslam Elmishtawy on 1/20/2018.
 */

public class CategoriesAdapter extends ArrayAdapter<Categories>{
    public CategoriesAdapter(Activity context, ArrayList<Categories> categoreisList){
        super(context,0, categoreisList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.categories_list,parent,false);

        }
        Categories t = getItem(position);
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.categoryImage);
        imageView.setImageResource(t.getmImage());
        return listItemView;
    }
}
