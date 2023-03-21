package _10_JOB;

import java.util.Arrays;

public class Test_Book {

    public static void main(String[] args) {
        Reader reader1 = new Reader("Потапов", 20, 4,
                "27.11.1996", "89511422662");
        Reader reader2 = new Reader("Лебедева", 10, 4,
                "27.11.1996", "89511422662");

        Book book1 = new Book("Иванов", "Приключения");
        Book book2 = new Book("Петров", "Энциклопедия");
        Book book3 = new Book("Сидоров", "Словарь");

        reader1.takeBook(book1);
        reader2.takeBook(book2);
        reader1.takeBook(book1.getType());
        reader2.takeBook(book2.getType());


    }
}