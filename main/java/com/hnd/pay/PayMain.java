package com.hnd.pay;

import com.hnd.pay.impl.ICBCBankPay;

public class PayMain {
    public static void main(String[] args) throws Exception {
        IPay payWay = new ICBCBankPay();
        System.out.println(payWay.getPay(0));
        Context con = new Context();
        con.calrechange(1, 2);
    }
}
