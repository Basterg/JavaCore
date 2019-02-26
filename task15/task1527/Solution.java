package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String u;
        String result = "";
        String obj = "";
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            u = "";

            if (chars[i]=='?'||chars[i]=='&') {
                for (int j = i+1; j < chars.length; j++) {
                    if (chars[j]!='='&&chars[j]!='&') {
                        u += chars[j];
                    }
                    else {

                        break;
                    }
                    i++;
                }

                result += u + " ";

                if (u.equals("obj")) {
                    for (int j = i + 2; j < chars.length; j++) {
                        if (!(chars[j] == '&')) {
                            obj += chars[j];
                        }
                        else {
                            break;
                        }
                        i++;

                    }
                }

            }
        }
        System.out.println(result);
        if (!(obj == "")){
            try {
                double k = Double.parseDouble(obj);
                alert(k);
            }
            catch (Exception e) {
                alert(obj);
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
