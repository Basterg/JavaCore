package com.javarush.task.task19.task1903;

/* 
Адаптация нескольких интерфейсов
*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static Map<String, String> countries = new HashMap<>();

    static {
        countries.put("UA", "Ucraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");
    }

    public static void main(String[] args) {

    }

    public static class IncomeDataAdapter implements Customer, Contact {
        IncomeData incomeData;

        public IncomeDataAdapter(IncomeData incomeData) {
            this.incomeData = incomeData;
        }

        @Override
        public String getCompanyName() {
            return this.incomeData.getCompany();
        }

        @Override
        public String getCountryName() {
            return countries.get(this.incomeData.getCountryCode());
        }

        @Override
        public String getName() {
            return this.incomeData.getContactFirstName() + ", " + this.incomeData.getContactLastName();
        }

        @Override
        public String getPhoneNumber() {
            String full = String.format("%010d", incomeData.getPhoneNumber());
            String telPart1 = "+" + incomeData.getCountryPhoneCode();
            String telPart2 = full.substring(0, 3);
            String telPart3 = full.substring(3, 6);
            String telPart4 = full.substring(6, 8);
            String telPart5 = full.substring(8, 10);
            String telFormated = String.format("%s(%s)%s-%s-%s", telPart1, telPart2, telPart3, telPart4, telPart5);
            return telFormated;
        }
    }


    public static interface IncomeData {
        String getCountryCode();        //For example: UA

        String getCompany();            //For example: JavaRush Ltd.

        String getContactFirstName();   //For example: Ivan

        String getContactLastName();    //For example: Ivanov

        int getCountryPhoneCode();      //For example: 38

        int getPhoneNumber();           //For example: 501234567
    }

    public static interface Customer {
        String getCompanyName();        //For example: JavaRush Ltd.

        String getCountryName();        //For example: Ukraine
    }

    public static interface Contact {
        String getName();               //For example: Ivanov, Ivan

        String getPhoneNumber();        //For example: +38(050)123-45-67
    }
}