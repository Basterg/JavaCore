package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        String fileName3 = reader.readLine();
        reader.close();

        FileOutputStream fileOutputStream = new FileOutputStream(fileName1, true);
        FileInputStream fileInputStream1 = new FileInputStream(fileName2);
        FileInputStream fileInputStream2 = new FileInputStream(fileName3);

        while (fileInputStream1.available() > 0) {
            byte[] buf = new byte[fileInputStream1.available()];
            fileOutputStream.write(fileInputStream1.read(buf));
        }
        fileInputStream1.close();

        while (fileInputStream2.available() > 0) {
            byte[] buf = new byte[fileInputStream2.available()];
            fileOutputStream.write(fileInputStream2.read(buf));
        }
        fileInputStream2.close();
        fileOutputStream.close();
    }
}
