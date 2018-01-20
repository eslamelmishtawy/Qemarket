package com.example.eslamelmishtawy.qemarkets;

import android.content.Context;
import android.graphics.Paint;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Collections;
import java.util.List;

/**
 * Created by Eslam Elmishtawy on 1/20/2018.
 */

public class TopSalesAdapter extends RecyclerView.Adapter<TopSalesAdapter.MyViewHolder> {
    List<TopSales> horizontalList = Collections.emptyList();
    Context context;
    private int mCartImage;
    private int mFavImage;

    public TopSalesAdapter(List<TopSales> horizontalList, Context context, int cartImage, int favImage) {
        this.horizontalList = horizontalList;
        this.context = context;
        mCartImage = cartImage;
        mFavImage = favImage;
    }
    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView itemName;
        TextView oldPrice;
        TextView newPrice;
        ImageView cartImage;
        ImageView favImage;
        public MyViewHolder(View view) {
            super(view);
            imageView=(ImageView) view.findViewById(R.id.salesImage);
            itemName = (TextView) view.findViewById(R.id.salesItemName);
            oldPrice = (TextView) view.findViewById(R.id.oldSalesItemPrice);
            newPrice = (TextView) view.findViewById(R.id.newSalesItemPrice);
            cartImage=(ImageView) view.findViewById(R.id.cartImage);
            favImage=(ImageView) view.findViewById(R.id.favImage);
        }
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.sales_list, parent, false);

        return new MyViewHolder(itemView);
    }
    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {

        holder.imageView.setImageResource(horizontalList.get(position).getmImage());
        holder.itemName.setText(horizontalList.get(position).getmItemName());
        holder.oldPrice.setText(horizontalList.get(position).getmOldPrice());
        holder.oldPrice.setPaintFlags(holder.oldPrice.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        holder.newPrice.setText(horizontalList.get(position).getmNewPrice());
        holder.cartImage.setImageResource(mCartImage);
        holder.favImage.setImageResource(mFavImage);
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
