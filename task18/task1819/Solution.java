package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        reader.close();

        FileInputStream fileInputStream1 = new FileInputStream(fileName1);
        FileInputStream fileInputStream2 = new FileInputStream(fileName2);

        byte[] buffer1 = new byte[fileInputStream1.available()];
        fileInputStream1.read(buffer1);
        fileInputStream1.close();

        byte[] buffer2 = new byte[fileInputStream2.available()];
        fileInputStream1.read(buffer2);
        fileInputStream1.close();

        FileOutputStream fileOutputStream = new FileOutputStream(fileName1);
        fileOutputStream.write(buffer2);
        fileOutputStream = new FileOutputStream(fileName1, true);
        fileOutputStream.write(buffer1);
        fileOutputStream.close();
    }
}
