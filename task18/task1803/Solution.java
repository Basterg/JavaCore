package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Самые частые байты
*/

public class Solution {
    static HashMap<Integer, Integer> mapOfBytes = new HashMap<>();

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();

        FileInputStream inputStream = new FileInputStream(filename);

        int value = 0;
        Integer count = 0;
        while (inputStream.available() > 0) {
            value = inputStream.read();
            count = mapOfBytes.get(value);
            if (count != null)
                count++;
            else
                count = 0;

            mapOfBytes.put(value, count);
        }

        inputStream.close();

        boolean first = true;
        int max = 0;
        for (int amountByte : mapOfBytes.values()) {
            if (first) {
                max = amountByte;
                first = false;
            }
            if (max < amountByte)
                max = amountByte;
        }

        for (Map.Entry pair : mapOfBytes.entrySet()) {
            if (max == (int) pair.getValue())
                System.out.print(" " + pair.getKey());
        }

    }
}
