package com.javarush.task.task12.task1204;

/* 
То ли птица, то ли лампа
*/

public class Solution {
    public static void main(String[] args) {
        printObjectType(new Cat());
        printObjectType(new Bird());
        printObjectType(new Lamp());
        printObjectType(new Cat());
        printObjectType(new Dog());
    }

    public static void printObjectType(Object o) {
        System.out.println((o instanceof Cat ? "Кошка" : "")
                + (o instanceof Dog ? "Собака" : "")
                + (o instanceof Bird ? "Птица" : "")
                + (o instanceof Lamp ? "Лампа" : ""));
    }

    public static class Cat {
    }

    public static class Dog {
    }

    public static class Bird {
    }

    public static class Lamp {
    }
}
