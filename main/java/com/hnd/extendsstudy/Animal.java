package com.hnd.extendsstudy;

public abstract class Animal {
    public Animal(){
        System.out.println("这是Animal的构造方法"+"===========animal被实例化了");
    }

    private void say(){
        System.out.println("动物会叫");
    }
    public void eat(){
        System.out.println("动物需要吃饭");
    }
    public void run(){
        say();
        System.out.println("动物会跑");
    }
    private void pao(){
        System.out.println("给我动起来");
    }


}
