package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = null;

        while (true) {
            String fileName = reader.readLine();
            try {
                fileInputStream = new FileInputStream(fileName);
            } catch (FileNotFoundException e) {
                System.out.println(fileName);
                fileInputStream.close();
                return;
            }
        }
    }
}
