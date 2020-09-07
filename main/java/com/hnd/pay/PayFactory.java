package com.hnd.pay;




import org.reflections.Reflections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class PayFactory {
    private PayFactory(){}
    private static PayFactory  factory = new PayFactory();
    public static PayFactory getInstance(){
        return factory;
    }
    //key 为bankId value 为支付实现类的类全名
   static Map <Integer,String >map = new HashMap();
    //利用自定义注解维护map
        //1.扫描报下的注解
    //Reflections
    static{

        Reflections reflections = new Reflections("com.hnd.pay.impl");
        Set<Class<?>> set = reflections.getTypesAnnotatedWith(pay.class);
        Iterator<Class<?>> iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }


    //根据map中的类全名反射得到相应的支付对象
    public IPay create(int bankId) throws Exception {
        Class clazz = Class.forName(map.get(bankId));
        IPay clazz_ = (IPay) clazz.newInstance();
        return clazz_;
    }
}
