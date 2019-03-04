package com.javarush.task.task16.task1607;

import java.util.ArrayList;
import java.util.List;

/* 
Horse Racing
*/

public class Solution {
    public static int countHorses = 10;

    public static void main(String[] args) throws InterruptedException {
        List<Horse> horses = prepareHorsesAndStart();
        while (calculateHorsesFinished(horses) != countHorses) {
        }
    }

    public static int calculateHorsesFinished(List<Horse> horses) throws InterruptedException {
        int countFinished = 0;
        for (Horse someHorse : horses)
        {
            if (someHorse.isFinished())
            {
                countFinished++;
            }
            else if (someHorse.isFinished() != true)
            {
                System.out.println("Waiting for " + someHorse.getName());
                someHorse.join();
            }
        }
        return countFinished;
    }

    public static class Horse extends Thread {

        public Horse(String name) {
            super(name);
        }

        private boolean isFinished;

        public boolean isFinished() {
            return isFinished;
        }

        public void run() {
            String s = "";
            for (int i = 0; i < 1001; i++) {   //delay
                s += new String("" + i);
                if (i == 1000) {
                    s = " is finished!";
                    System.out.println(getName() + s);
                    isFinished = true;
                }
            }
        }
    }

    public static List<Horse> prepareHorsesAndStart() {
        List<Horse> horses = new ArrayList<Horse>(countHorses);
        String number;
        for (int i = 1; i < countHorses + 1; i++) {
            number = i < 10 ? ("0" + i) : "" + i;
            horses.add(new Horse("Horse_" + number));
        }

        for (int i = 0; i < countHorses; i++) {
            horses.get(i).start();
        }
        return horses;
    }
}
