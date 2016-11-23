package com.example.vayne.newsun;

/**
 * Created by Vayne on 2016/11/18.
 * 线程安全 双重检索单例模式
 */

public class DoubleCheck {
    private static DoubleCheck instance = null;
    public static DoubleCheck getInstance(){
        if (instance == null){
            synchronized (DoubleCheck.class){
                if (instance == null){
                    instance = new DoubleCheck();
                }
            }
        }
        return  instance;
    }

}

//public class Singleton {
//
//    private static Singleton instance = null;
//
//    public static Singleton getInstance() {
//        if (instance == null) {
//            synchronized (Singleton.class) { // 调用之前先获得类的锁
//                if (instance == null) {
//                    instance = new Singleton();
//                }
//            }
//        }
//        return instance;
//    }
//}
