package com.javarush.task.task15.task1523;

/* 
Перегрузка конструкторов
*/

public class Solution {
    public Solution(){}
    public Solution(int i){}
    public Solution(String i){}

    private Solution(short i){}
    private Solution(byte i){}
    private Solution(char i){};

    Solution (int g,short i){}
    Solution (float g,short i){}
    Solution (String g,short i){}

    protected Solution (char s, int i){}
    protected Solution (int i, char g){}
    protected Solution (String s, int i){}
}

