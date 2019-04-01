package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        reader.close();

        BufferedReader fileReader = new BufferedReader(new FileReader(fileName1));
        int count = 0;
        String word = "world";
        while (fileReader.ready()) {
            String line = fileReader.readLine();
            String[] words = line.split("\\W");
            for (String currentWord : words)
                if (currentWord.equals(word))
                    count++;

        }
        fileReader.close();

        System.out.println(count);
    }
}
