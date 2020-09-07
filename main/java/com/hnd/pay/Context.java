package com.hnd.pay;

import java.math.BigDecimal;

/**
 * 1.获取上文
 * 2.根据上文获取对应的实现类
 * 3.根据实现类计算金额（下文）
 * 3.返回下文
 */
public class Context {
   public  BigDecimal calrechange(int bankId, int goodId) throws Exception {
       IPay payWay = PayFactory.getInstance().create(bankId);
      /* BigDecimal pay = payWay.getPay(goodId);*/
       return null;
    }
}
