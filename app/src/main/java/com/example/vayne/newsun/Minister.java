package com.example.vayne.newsun;

/**
 * Created by Vayne on 2016/11/7.
 */

public class Minister {
   public void Minister(){
       for (int day = 0; day < 3; day++) {
           Emperor emperor = Emperor.getInstance();
           emperor.say();
       }
   }
}
