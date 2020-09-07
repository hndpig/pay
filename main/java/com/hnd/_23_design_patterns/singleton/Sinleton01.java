package com.hnd._23_design_patterns.singleton;

/**
 * 饿汉式单例模式
 */
public class Sinleton01 {
    private static Sinleton01 sinleton= new Sinleton01();
    private  Sinleton01(){}
    public static Sinleton01 getInstance(){
        return sinleton;
    }


}
 class main01{
    public static void main(String[] args) {
        for (int i = 0 ;i<10000;i++){
            new Thread(()->{
                Sinleton01 sinleton = Sinleton01.getInstance();
                System.out.println(sinleton.hashCode());
            }).start();
        }
    }
}