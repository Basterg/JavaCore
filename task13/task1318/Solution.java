package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileName = reader.readLine();
        InputStream stream = new FileInputStream(fileName);
        String result = "";

        while(stream.available() > 0) {
            char data = (char) stream.read();
            result += data;
        }

        stream.close();
        reader.close();

        System.out.println(result);
    }
}