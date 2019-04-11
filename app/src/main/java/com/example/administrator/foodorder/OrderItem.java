package com.example.administrator.foodorder;

/**
 * Created by Administrator on 2019/4/11.
 */

public class OrderItem {
    public Dish mDish;           //菜肴
    public int mQuantity = 0;    //菜肴数目

    OrderItem(Dish d,int q){
        this.mDish = d;
        this.mQuantity = q;
    }

    public double getItenTotalPrice(){
        return this.mDish.mPrice*this.mQuantity;
    }
}
