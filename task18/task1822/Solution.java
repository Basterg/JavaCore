package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader2 = new BufferedReader(new FileReader(reader1.readLine()));
        reader1.close();

        while (reader2.ready()) {
            String string = reader2.readLine();
            if (string.startsWith(args[0]))
                System.out.println(string);
        }
        reader2.close();
    }
}
