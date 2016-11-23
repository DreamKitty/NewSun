package com.example.vayne.newsun;

/**
 * Created by Vayne on 2016/11/7.
 */

/***
 * 线程不安全的实例
 * 此方法，有可能有出现多个该类的实例
 * 如果 线程 A 执行到 singleton = new Singleton(),但还没有获得到对象（对象初始化时需要时间的），
 * 线程 B 也执行到，（singleton == null）的判断，那么线程 B 获得的判断条件也是真，于是继续执行下去
 * 线程 A,B 都获取到了该类的实例，内存中出现两个对象
 *
 */
public class Singleton {
    private static  Singleton singleton = null;
   //限制多个对象
    private void Singleton(){

    }
    //通过刚方法获得实例对象
    public  static Singleton getSingleton(){
        if (singleton == null){
            singleton = new Singleton();
        }
        return  singleton;
    }



}
