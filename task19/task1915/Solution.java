package com.javarush.task.task19.task1915;

/* 
Дублируем текст
*/

import java.io.*;

class Solution {

    private static final TestString testString = new TestString();

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        bufferedReader.close();

        PrintStream defaultPrintStream = System.out;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(byteArrayOutputStream));
        testString.printSomething();
        System.setOut(defaultPrintStream);

        String result = byteArrayOutputStream.toString();
        PrintWriter printWriter = new PrintWriter(new FileWriter(fileName));
        printWriter.println(result);
        printWriter.close();
        System.out.println(result);
    }

    static class TestString {

        void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}


