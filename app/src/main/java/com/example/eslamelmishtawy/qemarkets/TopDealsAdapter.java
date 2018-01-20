package com.example.eslamelmishtawy.qemarkets;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Collections;
import java.util.List;

/**
 * Created by Eslam Elmishtawy on 1/20/2018.
 */

public class TopDealsAdapter extends RecyclerView.Adapter<TopDealsAdapter.MyViewHolder> {
    List<TopDeals> horizontalList = Collections.emptyList();
    Context context;


    public TopDealsAdapter(List<TopDeals> horizontalList, Context context) {
        this.horizontalList = horizontalList;
        this.context = context;
    }
    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        public MyViewHolder(View view) {
            super(view);
            imageView=(ImageView) view.findViewById(R.id.topImage);
        }
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.top_list, parent, false);

        return new MyViewHolder(itemView);
    }
    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {

        holder.imageView.setImageResource(horizontalList.get(position).getmImage());
        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
            }

        });

    }
    @Override
    public int getItemCount()
    {
        return horizontalList.size();
    }
}
