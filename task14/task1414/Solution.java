package com.javarush.task.task14.task1414;

/* 
MovieFactory
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception  {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String key;
        for (int i = 0; i > -1 ; i++) {
            key = reader.readLine();
            if ((key.equals("cartoon"))||(key.equals("triller"))||(key.equals("soapOpera"))) {
                Movie movie = MovieFactory.getMovie(key);
                System.out.println(movie.getClass().getSimpleName());
            }
            else {
                break;
            }
        }
        //ввести с консоли несколько ключей (строк), пункт 7

        /*
8 Создать переменную movie класса Movie и для каждой введенной строки(ключа):
8.1 получить объект используя MovieFactory.getMovie и присвоить его переменной movie
8.2 вывести на экран movie.getClass().getSimpleName()
        */

    }

    static class MovieFactory
    {

        static Movie getMovie(String key)
        {
            Movie movie = null;

            //создание объекта SoapOpera (мыльная опера) для ключа "soapOpera"
            if ("soapOpera".equals(key))
            {
                movie = new SoapOpera();
            }

            if ("triller".equals(key)){
                movie = new Triller();
            }

            if ("cartoon".equals(key)){
                movie = new Cartoon();
            }

            return movie;
        }
    }

    static abstract class Movie {

    }

    static class SoapOpera extends Movie {

    }

    private static class Cartoon extends Movie {

    }

    public static class Triller extends Movie {

    }
}
