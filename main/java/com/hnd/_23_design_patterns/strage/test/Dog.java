package com.hnd._23_design_patterns.strage.test;

import java.util.Arrays;

public class Dog implements Comparble<Dog> {
    private  int age;
    private String name;

    public Dog(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Dog data) {

        if(this.age>data.age)
            return -1;
        else if (this.age<data.age)
            return 1;
        else
            return 0;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                '}';
    }
}
class main{
    public static void main(String[] args) {
        Sorter<Dog> sorter = new Sorter();
        int[] nums = {5, 5, 2, 8, 9, 1};
        Dog [] dogs = {new Dog(1),new Dog(11),new Dog(12),new Dog(13),new Dog(12),new Dog(5)};
        sorter.sort(dogs);
        System.out.println(Arrays.toString(dogs));
    }
}