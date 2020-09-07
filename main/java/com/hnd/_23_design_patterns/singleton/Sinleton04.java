package com.hnd._23_design_patterns.singleton;

/**
 * 完美写法 懒汉单例模式
 */
public class Sinleton04 {
    private static Sinleton04 instance ;
    private Sinleton04(){}
    private static class GetInstance{
        public static final Sinleton04 sinleton04 = new Sinleton04();
        private  static Sinleton04 getInstance(){
            return sinleton04;
        }
    }

    public static Sinleton04 getInstance(){
        if(instance == null){

            instance = GetInstance.getInstance();

        }
        return instance;
    }
}
class main04{
    public static void main(String[] args) {
        for(int i =0;i<10000;i++){
            new Thread(()->{
                Sinleton04 instance = Sinleton04.getInstance();
                System.out.println(instance.hashCode());
            }).start();
        }
    }
}