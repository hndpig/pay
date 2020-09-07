package com.hnd._23_design_patterns.singleton;

/**
 * 双重检测保证只有一个实例 懒汉单例模式
 * 效率较低
 */
public class Sinleton03 {
    private static Sinleton03 instance;
    private  Sinleton03(){}

    public static Sinleton03 getInstance(){
        if (instance == null){
            /*
            为啥锁类
             */
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (Sinleton03.class){
            if (instance == null)
                instance = new Sinleton03();
            }

        }
        return instance;
    }

}
class main03{
    public static void main(String[] args) {
        for (int i =0 ;i<10000;i++){
            new Thread(()->{
                Sinleton03 instance = Sinleton03.getInstance();
                System.out.println(instance.hashCode());
            }).start();
        }
    }
}