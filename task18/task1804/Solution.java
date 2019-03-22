package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Самые редкие байты
*/

public class Solution {
    static long[] array = new long[256];

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        reader.close();

        long minCount = Long.MAX_VALUE;
        while (inputStream.available() > 0){
            int currentByte = inputStream.read();
            array[currentByte]++;
        }
        inputStream.close();

        for (int i = 0; i < array.length; i++) {
            if (array[i] < minCount){
                minCount = array[i];
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == minCount){
                System.out.print(i + " ");
            }
        }
    }

}
