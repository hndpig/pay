package com.hnd.annotations;


import java.lang.annotation.*;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 *
 * 注解与反射练习
 * ORM
 *
 */
public class PracticeRandA {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, InstantiationException {

        student student = new student();
//        student.setAge(18);

        student.setId(123456);
        student.setName("苏大强");
        System.out.println(student);

        Class clazz = student.getClass();
        Field age = clazz.getDeclaredField("age");
        Map<String ,String > map = checkNotNull(age, student);
        for (String  key : map.keySet()) {
            System.out.println(map.get(key));
        }

    }

    public static Map checkNotNull(Field field , Object obj){
        Map<String ,String > map = new HashMap();
        nutNull aNull = field.getAnnotation(nutNull.class);
        boolean flag = aNull.flag();
        if(flag){
            field.setAccessible(true);
            try {
                Object o = field.get(obj);
                if (o==null){
                    map.put(field.getName(), aNull.message());
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        return map;
    }
}
@Tteble("student")
class student{
    @Tcloum(length = 10,name = "id",type = "int")
    private int id;
    @Tcloum(length = 10,name = "name",type = "varchar")
    private String name;
    @Tcloum(length = 10,name = "age",type = "int")
    @nutNull(message = "此处不能为空")
    private Integer age;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Tteble{
    String value();
}

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface Tcloum{
    String type();
    String name();
    int length();
}
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface nutNull{
    boolean flag() default true;
    String message();
}