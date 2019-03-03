package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s = reader.readLine();
            if (s.equals("exit")){
                break;
            }
            if (s.contains(".")&&checkString(s)) {

                print(Double.parseDouble(s));

            } else if (checkString(s)) {
                int a = Integer.parseInt(s);
                if (a > 0 && a < 128) {
                    print((short) a);
                }
                if (a >= 128) {
                    print(a);
                }
            } else {
                print(s);
            }
        }
    }

    public static boolean checkString(String string) {
        try {
            Double.parseDouble(string);
        }
        catch (Exception e) {
            return false;
        }
        return true;
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
