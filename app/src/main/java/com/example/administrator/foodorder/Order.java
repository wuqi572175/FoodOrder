package com.example.administrator.foodorder;

import java.util.logging.SocketHandler;

public class Order {
    /**
     * 订单类
     * 谁，何时，买了啥，订单号
     */
    String mUserName;
    int mID = -1;
    public String mOderTime;
    ShoppingCart mOrderItems;

    Order(String mUserName){
        this.mUserName = mUserName;
        mOrderItems = new ShoppingCart(mUserName);
    }

    Order(int mID, ShoppingCart cart,String mOderTime){
        this.mID=mID;
        this.mOrderItems = cart;
        this.mOderTime = mOderTime;

    }
}
