package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<>();

    public static void main(String[] args) throws IOException {
        String fileName;
        while (true) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            fileName = reader.readLine();
            if (fileName.equals("exit")) {
                reader.close();
                break;
            }
            ReadThread readThread = new ReadThread(fileName);
            readThread.start();
        }
    }

    public static class ReadThread extends Thread {
        String fileName;

        public ReadThread(String fileName) {
            this.fileName = fileName;
        }

        @Override
        public void run() {
            try {
                FileInputStream fileInputStream = new FileInputStream(fileName);
                while (fileInputStream.available() > 0) {
                    byte[] buf = new byte[fileInputStream.available()];
                    fileInputStream.read(buf);
                    resultMap.put(fileName, findMaxByte(buf));
                }
                fileInputStream.close();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static int findMaxByte(byte[] bytes) {
        int max = 0;
        for (int i = 0; i < bytes.length; i++) {
            if (bytes[i] > max) {
                max = bytes[i];
            }
        }
        return max;
    }
}
