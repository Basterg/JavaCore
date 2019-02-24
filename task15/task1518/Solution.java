package com.javarush.task.task15.task1518;

/* 
Статики и котики
*/

public class Solution {
    public static Object cat;

    static {
        class Cat {
            public String name = "Lul";
        }
        Cat cot = new Cat();
        cat = cot;
        System.out.println(cot.name);
    }

}
