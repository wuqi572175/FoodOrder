package com.example.administrator.foodorder;

import android.app.Application;
import android.content.Context;

import java.util.ArrayList;

public class MyApp extends Application {
    User user;
    ShoppingCart gcart;
    ArrayList<Order> gOrderse;
    Dishes gDishes;
    String gIp;
    int gCommMode = 1;//tTCP:1,GHTTP:2
    int gPort = 12345;
    Context gContext;
}
