package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String firstFileName = reader.readLine();
        String secondFileName = reader.readLine();
        reader.close();

        FileReader fileReader = new FileReader(firstFileName);
        FileWriter fileWriter = new FileWriter(secondFileName);

        int count = 1;
        while (fileReader.ready()) {
            int value = fileReader.read();
            if (count % 2 == 0)
                fileWriter.write(value);
            count++;
        }
        fileReader.close();
        fileWriter.close();
    }
}
