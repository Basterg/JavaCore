package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    static ArrayList<Integer> listOfBytes = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        String fileOne = readFileName();
        String fileTwo = readFileName();
        String fileThree = readFileName();

        FileInputStream inputStream = new FileInputStream(fileOne);
        while (inputStream.available() > 0) {
            listOfBytes.add(inputStream.read());
        }
        int bytesCount = listOfBytes.size();

        FileOutputStream outputStream1 = new FileOutputStream(fileTwo);
        FileOutputStream outputStream2 = new FileOutputStream(fileThree);
        if (bytesCount % 2 == 0) {
            while (inputStream.available() > (bytesCount / 2)) {
                outputStream1.write(inputStream.read());
            }
            while (inputStream.available() > 0) {
                outputStream2.write(inputStream.read());
            }
        } else {
            while (inputStream.available() > ((bytesCount - 1) / 2)) {
                outputStream1.write(inputStream.read());
            }
            while (inputStream.available() > 0) {
                outputStream2.write(inputStream.read());
            }
        }
        inputStream.close();
        outputStream1.close();
        outputStream2.close();
    }

    public static String readFileName() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }
}
