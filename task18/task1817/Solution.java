package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static int count = 0;
    public static int spacesCount = 0;
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("C:/data1.txt");
        int cuurentByte;
        while (fileInputStream.available() > 0) {
            cuurentByte = fileInputStream.read();
            if (cuurentByte == 32) {
                spacesCount++;
            } else {
                count++;
            }
        }
        fileInputStream.close();

        System.out.println(String.format("%.2f", ((float) spacesCount / count) * 100));
    }
}
