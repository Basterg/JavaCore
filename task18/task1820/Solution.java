package com.javarush.task.task18.task1820;

/* 
Округление чисел (Повторить split)
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();

        ArrayList<String> list = new ArrayList<>();
        reader = new BufferedReader(new FileReader(fileName1));
        while (reader.ready())
            list.add(reader.readLine());
        reader.close();

        ArrayList<Long> values = new ArrayList<>();
        for (String string : list) {
            for (String part : string.split(" ")) {
                double a = Double.parseDouble(part);
                values.add(Math.round(a));
            }
        }

        FileWriter fileWriter = new FileWriter(fileName2);
        for (Long value : values)
            fileWriter.write( value.toString()+" ");

        fileWriter.close();
    }
}
