package com.javarush.task.task15.task1504;

import java.util.LinkedList;
import java.util.List;

/* 
ООП - книги
*/

public class Solution {
    public static void main(String[] args) {
        List<Book> books = new LinkedList<Book>();
        books.add(new MarkTwainBook("Tom Sawyer"));
        books.add(new AgathaChristieBook("Hercule Poirot"));
        System.out.println(books);
    }

    public abstract static class Book {
        private String author;

        public Book(String author) {
            this.author = author;
        }

        public abstract Book getBook();

        public abstract String getName();

        private String getOutputByBookType() {
            String agathaChristieOutput = author + ", " + getBook().getName() + " is a detective";
            String markTwainOutput = getBook().getName() + " book was written by " + author;

            String output = "output";
            if (this instanceof MarkTwainBook) {
                output = markTwainOutput;
            }
            if (this instanceof AgathaChristieBook) {
                output = agathaChristieOutput;           }
            return output;
        }

        public String toString() {
            return getOutputByBookType();
        }
    }
    public static class MarkTwainBook extends Book {
        private String booksName;
        public MarkTwainBook(String booksName) {
            super("Mark Twain");
            this.booksName = booksName;
        }

        @Override
        public MarkTwainBook getBook() {
            return this;
        }

        @Override
        public String getName() {
            return booksName;
        }
    }public static class AgathaChristieBook extends Book {
        private String booksName;
        public AgathaChristieBook(String booksName) {
            super("Agatha Christie");
            this.booksName = booksName;
        }

        @Override
        public AgathaChristieBook getBook() {
            return this;
        }

        @Override
        public String getName() {
            return booksName;
        }
    }
}
