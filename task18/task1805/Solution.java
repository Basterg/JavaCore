package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Сортировка байт
*/

public class Solution {
    static long[] array = new long[256];

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        reader.close();

        while (inputStream.available() > 0){
            int b = inputStream.read();
            array[b]++;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0){
                System.out.print(i + " ");
            }
        }

    }
}
