package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Solution {
    public static int count = 0;
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("C:/data1.txt");
        while (fileInputStream.available() > 0) {
            int currentByte = fileInputStream.read();
            if ((currentByte >= 64 && currentByte <= 90) || (currentByte >= 97 && currentByte <= 122)) {
                count++;
            }
        }
        fileInputStream.close();
        System.out.println(count);
    }
}
