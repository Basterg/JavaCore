package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Самые частые байты
*/

public class Solution {
    public static ArrayList<Integer> list = new ArrayList<>();
    public static HashMap<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) throws Exception {
        fillTheListBytes();
        fillTheMapBytesAndCounts();
        printMaxRepeatedBytes();
    }

    public static String readFileName() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        return fileName;
    }

    public static void fillTheListBytes() throws IOException {
        FileInputStream inputStream = new FileInputStream(readFileName());
        int currentByte;
        while (inputStream.available() > 0) {
            currentByte = inputStream.read();
            list.add(currentByte);
        }
        inputStream.close();
    }

    public static void fillTheMapBytesAndCounts() {
        for (int itrByte : list) {
            int newValue;
            if (map.containsKey(itrByte)) {
                newValue = map.get(itrByte) + 1;
                map.put(itrByte, newValue);
            } else {
                map.put(itrByte, 1);
            }
        }
    }

    public static int findMaxCount() {
        ArrayList<Integer> listOfCounts = new ArrayList<>(map.values());
        int max = 0;
        for (int maxCount : listOfCounts) {
            if (maxCount > max) {
                max = maxCount;
            }
        }
        return max;
    }

    public static void printMaxRepeatedBytes() {
        int max = findMaxCount();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            if (value == max) {
                System.out.print(key + " ");
            }
        }
    }

}
