package com.hnd.pay.impl;


import com.hnd.pay.IPay;
import com.hnd.pay.pay;

import java.math.BigDecimal;
@pay(value = "1")
public class ICBCBankPay  implements IPay {
    @Override
    public BigDecimal getPay(int  goodId) {
        String [] good = main.com.hnd.pay.Data.Data.getGoods()[goodId];
        BigDecimal price = BigDecimal.valueOf(Double.valueOf(good[1]));
       //工商银行5折
        return  price.multiply(new BigDecimal(0.5));
    }
}
