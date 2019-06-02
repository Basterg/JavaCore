package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));

        ArrayList<Integer> listOfNumbers = new ArrayList<>();

        while (reader.ready()) {
            int number = Integer.parseInt(reader.readLine());
            if (number % 2 == 0) {
                listOfNumbers.add(number);
            }
        }
        reader.close();

        sort(listOfNumbers);
        for (int number : listOfNumbers) {
            System.out.println(number);
        }
    }

    public static void sort(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {
                int currentElement = list.get(j);
                int nextElement = list.get(j + 1);
                if (currentElement > nextElement) {
                    list.add(j, nextElement);
                    list.add(j + 1, currentElement);
                }
            }
        }
    }
}
