package com.example.vayne.newsun;

/**
 * Created by Vayne on 2016/11/7.
 */

/**
 * 单例模式： 确保某个对象只有一个实例，而且自行实例化，并且向系统提供这个类的实例
 *
 * 这个方法实现单例 是比较好的，确保只能有一个实例
 */
public class Emperor {
    public static final Emperor emperor = new Emperor();
    //限制多个对象
   private Emperor(){

   }
    //提供实例
    public static Emperor getInstance(){
        return emperor;
    }
    public static void say(){
        System.out.println("i am king");
    }

}
