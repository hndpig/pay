package com.hnd._23_design_patterns.singleton;

/**
 * 懒汉式单例模式
 * 在多线程下不保证只有一个实例
 */
public class Sinleton02 {
    private static Sinleton02 sinleton;
    private  Sinleton02(){}
    public static Sinleton02 getInstance(){

        if(sinleton==null){
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            sinleton = new Sinleton02();

        }

        return sinleton;
    }

}
class main02{
    public static void main(String[] args) {
        for(int i = 0 ;i<10000;i++){
            new Thread(()->{

                Sinleton02 sinleton = Sinleton02.getInstance();
                System.out.println(sinleton.hashCode());
            }).start();
        }
    }
}