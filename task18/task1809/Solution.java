package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileOneName = reader.readLine();
        String fileTwoName = reader.readLine();
        reader.close();

        FileInputStream inputStream = new FileInputStream(fileOneName);
        FileOutputStream outputStream = new FileOutputStream(fileTwoName);

        while (inputStream.available() > 0) {
            byte[] buf = new byte[inputStream.available()];
            byte[] reverseByf = new byte[buf.length];
            inputStream.read(buf);

            for (int i = buf.length - 1; i >= 0; i--) {
                reverseByf[buf.length - i - 1] = buf[i];
            }
            outputStream.write(reverseByf);
        }
        inputStream.close();
        outputStream.close();
    }
}
