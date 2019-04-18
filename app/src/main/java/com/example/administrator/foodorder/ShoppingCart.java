package com.example.administrator.foodorder;

import java.util.ArrayList;

public class ShoppingCart {
    ArrayList<OrderItem> orderItems;
    // TODO: 购物车需要分辨一下是哪个用户的
    //暂时放用户名
    String mUserName;


    ShoppingCart(String mUserName){
        this.mUserName = mUserName;
        orderItems = new ArrayList<>();

    }
    ShoppingCart(String mUserName,ArrayList<OrderItem>  orderItems){
        this.mUserName = mUserName;
        this.orderItems = orderItems;
    }
    //购物车内菜品的种类数
    public int getOrderItemsQuantity(){
        return orderItems.size();
    }
    //计算总价
    public  double getCartTotalPrice(){
        double totalPrice = 0;
        if (!orderItems.isEmpty()) {
            for (int i = 0; i < orderItems.size(); i++) {
                totalPrice += orderItems.get(i).getItenTotalPrice();


            }
        }
        return totalPrice;
    }
    //添加到购物车
    public int addOneOrderItem(Dish dish,int num){
        int index = getDishIndex(dish);
        if (index>0){
            //之前点过
            OrderItem orderItem = new OrderItem(dish,num);
            orderItems.set(index,orderItem);
            return index;
        }else{
            //新点的
            OrderItem orderItem = new OrderItem(dish,num);
            orderItems.add(orderItem);
            return orderItems.size()-1;
        }
    }
    private int getDishIndex(Dish dish){
        String dishName = dish.mName;
        if (!orderItems.isEmpty()){
            for (int i = 0; i <orderItems.size() ; i++) {
                OrderItem orderItem = orderItems.get(i);
                if (dish.mName.equals(orderItem.mDish.mName)){
                    return i;
                }

            }
        }
        return -1;
    }





     //从购物车删除
    public void deleteOneOrderItem(Dish dish){
        if (!orderItems.isEmpty()){
            for (int i = 0; i <orderItems.size() ; i++) {
                OrderItem orderItem = orderItems.get(i);
                if (dish.mName.equals(orderItem.mDish.mName))
                    orderItems.remove(i);
                break;

            }
        }
    }
    //修改购物车中菜的数量
    public int updateOneOrderItem(Dish dish,int num){
        if(!orderItems.isEmpty()){
            for (int i = 0; i <orderItems.size() ; i++) {
                OrderItem orderItem = orderItems.get(i);
                if (dish.mName.equals(orderItem.mDish.mName)){
                    orderItem.mQuantity = num;
                    orderItems.set(i,orderItem);
                    return i;
                }

            }
        }
        return  -1;
    }

}
