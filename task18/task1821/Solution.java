package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Solution {
    public static int[] bytes = new int[256];
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("C:/data1.txt");
        int currentByte;
        char currentChar;
        while (fileInputStream.available() > 0) {
            currentByte = fileInputStream.read();
            bytes[currentByte] += 1;
        }
        fileInputStream.close();

        for (int i = 0; i < 256; i++) {
            currentChar = (char) i;
            System.out.println(currentChar + " " + bytes[i]);
        }
    }
}
