package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        TreeSet<String> fileNames = new TreeSet<>();
        String currentPath = null;
        String lastFileName = null;
        while (true) {
            String readedFileName = reader.readLine();
            if (readedFileName.equals("end"))
                break;
            File tmp = new File(readedFileName);
            fileNames.add(tmp.getName());
            currentPath = tmp.getParent();
            lastFileName = tmp.getName();
        }
        reader.close();

        String outputFileName = currentPath + "\\" + lastFileName.substring(0, lastFileName.indexOf(".part"));
        FileOutputStream fileWrite = new FileOutputStream(outputFileName);
        for (String fileName : fileNames) {
            FileInputStream fileRead = new FileInputStream(currentPath + "\\" + fileName);
            while (fileRead.available() > 0) {
                byte[] buf = new byte[fileRead.available()];
                fileRead.read(buf);
                fileWrite.write(buf);
            }
            fileRead.close();
        }
        fileWrite.close();
    }
}
