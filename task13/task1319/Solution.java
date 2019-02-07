package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName)));

        while (true) {
            String string = reader.readLine();
            writer.write(string);
            if (string.equals("exit")) {
                break;
            }
            writer.newLine();
        }


        reader.close();
        writer.close();
    }
}
