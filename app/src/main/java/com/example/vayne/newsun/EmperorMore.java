package com.example.vayne.newsun;

/**
 * Created by Vayne on 2016/11/7.
 */

import java.util.ArrayList;
import java.util.Random;

/***
 *单例模式的扩展，有上限的多例模式 ，此处实现两个实例
 *
 */
public class EmperorMore {
    //产生2个实例
    private static int NumOfEmperor = 2;
    //名字集合
    private  static ArrayList<String> nameList = new ArrayList<String>();
    //当前类的实例
    private static ArrayList<EmperorMore> emperoror = new ArrayList<EmperorMore>();
    //当前类的序列号
    private static int CurrentNumber = 0;

    private EmperorMore(){

    }
    //传入名称，创建类的实例
    private EmperorMore(String name){
        nameList.add(name);
    }
    //产生所有的对象
    static {
        for (int i = 0; i < NumOfEmperor; i++) {
            emperoror.add(new EmperorMore((i+1)+" 皇帝"));
        }
    }
    //随机获取该类的实例
    public static EmperorMore getEmperorMoreInstance(){
        Random random = new Random();
        CurrentNumber = random.nextInt(NumOfEmperor);
        return emperoror.get(CurrentNumber);

    }
    public static  String say(){
        return nameList.get(CurrentNumber);
    }
}
