package com.hnd.extendsstudy;

public class Dog extends Animal {
    public Dog(){
        this.run();
        System.out.println("这是Dog的构造方法"+"===========dog被实例化了");
    }

    @Override
    public void run() {
        System.out.println("狗会跑");
    }

}
