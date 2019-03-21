package com.javarush.task.task18.task1801;

import java.io.FileInputStream;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        FileInputStream inputStream = new FileInputStream("c:/data.txt");
        int max = 0;
        int curentByte;
        while (inputStream.available() > 0) {
            curentByte = inputStream.read();
            if (curentByte > max) {
                max = curentByte;
            }
        }
        inputStream.close();

        System.out.println(max);
    }
}
