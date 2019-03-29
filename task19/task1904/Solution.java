package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner {
        Scanner fileScanner;

        public PersonScannerAdapter(Scanner scanner) {
            this.fileScanner = scanner;
        }

        @Override
        public Person read() throws IOException {
            return null;
        }

        @Override
        public void close() throws IOException {
            this.fileScanner.close();
        }
    }
}
