package com.example.eslamelmishtawy.qemarkets;

/**
 * Created by Eslam Elmishtawy on 1/20/2018.
 */

public class TopSales {
    private int mImage;
    private String mItemName;
    private String mOldPrice;
    private String mNewPrice;
    public TopSales(int image, String itemName, String oldPrice, String newPrice){

        mImage = image;
        mItemName = itemName;
        mOldPrice = oldPrice;
        mNewPrice = newPrice;
    }

    public int getmImage() {
        return mImage;
    }

    public String getmNewPrice() {
        return mNewPrice;
    }

    public String getmOldPrice() {
        return mOldPrice;
    }

    public String getmItemName() {
        return mItemName;
    }
}
