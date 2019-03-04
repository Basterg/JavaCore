package com.javarush.task.task16.task1618;

/* 
Снова interrupt
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        TestThread testThread = new TestThread();
        testThread.start();
        testThread.interrupt();
    }


    public static class TestThread extends Thread {
        @Override
        public void interrupt() {
            super.interrupt();
            System.out.println("Итераптируем");
        }

        @Override
        public void run() {
            super.run();
            System.out.println("Ранируем");
        }
    }
}