package com.example.administrator.foodorder;

import java.util.ArrayList;

/**
 * Created by Administrator on 2019/4/11.
 */

public class Dishes {
    public ArrayList<Dish> dishes;//菜肴列表

    //获得菜单
    public int getDishQuantity(){
        return  dishes.size();
    }

    //根据id获得菜肴信息
    public Dish getDishById(int id){
        return dishes.get(id);
    }

    //根据名称获得菜肴信息
    public Dish getDishByName(String name) {
        for (int i = 0; i < dishes.size(); i++)
        {
            Dish dish = dishes.get(i);
            if (dish.mName.equals(name))
                return dish;
        }
        return null;}
}
