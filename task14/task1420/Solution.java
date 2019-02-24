package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.concurrent.Phaser;

public class Solution {
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int firstNumber = Integer.parseInt(reader.readLine());
        int secondNumber = Integer.parseInt(reader.readLine());
        int remain = 0;
        while (true) {
            if (firstNumber > secondNumber) {
                if (firstNumber % secondNumber == 0){
                    System.out.println(secondNumber);
                    break;
                } else {
                    remain = firstNumber % secondNumber;
                    firstNumber = secondNumber;
                    secondNumber = remain;
                }
            } else {
                remain = firstNumber;
                firstNumber = secondNumber;
                secondNumber = remain;
            }
        }
    }
}
