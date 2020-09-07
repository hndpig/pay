package main.com.hnd.pay.Data;

public class Data {
    static String [][] banks = new String[5][2];
    static String [][] goods = new String[5][2];
    static{
       for(int i = 0 ;i < banks.length ;i++){
           banks[i][0] = Integer.toString(i+1);
           goods[i][0] = Integer.toString(i+1);
           for(int j = 0 ;j < banks[i].length;j++){
               if(j/1==1){
                   banks[i][j] ="银行"+(i+1);
                   goods[i][j] = Integer.toString((i+1)*100);
               }

           }
       }
    }

    public static String[][] getBanks() {
        return banks;
    }

    public static String[][] getGoods() {
        return goods;
    }
}
