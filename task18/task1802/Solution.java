package com.javarush.task.task18.task1802;

import java.io.FileInputStream;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        FileInputStream inputStream = new FileInputStream("c:/data.txt");
        int min = inputStream.read();
        int curentByte;
        while (inputStream.available() > 0) {
            curentByte = inputStream.read();
            if (curentByte < min) {
                min = curentByte;
            }
        }
        inputStream.close();

        System.out.println(min);
    }
}
