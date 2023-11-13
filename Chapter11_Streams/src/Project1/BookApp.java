package Project1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookApp {
    public static void main(String[] args) {

        Person person1 = new Person("J.K.",   "Rowling",     LocalDate.of(1965, 7, 31));
        Person person2 = new Person("Eckhart","Tolle",       LocalDate.of(1948, 2, 16));
        Person person3 = new Person("Antoine","Galland",     LocalDate.of(1646, 4, 4));
        Person person4 = new Person("Dante",  "Alighieri",   LocalDate.of(1265, 9, 14));
        Person person5 = new Person("William","Shakespeare", LocalDate.of(1564, 4, 23));

        Book[] books = new Book[5];
        books[0] = new Book("Harry potter",     person1, LocalDate.of(1997, 6,  26), "Fantastic");
        books[1] = new Book("The power of now", person2, LocalDate.of(1997, 11, 13), "Spiritual");
        books[2] = new Book("1001 nights",      person3, LocalDate.of(1704, 9,  5),  "Adventure");
        books[3] = new Book("Dante's hel",      person4, LocalDate.of(1481, 1,  21), "Horror");
        books[4] = new Book("Hamlet",           person5, LocalDate.of(1603, 6,  14), "Poetic");


        System.out.println("Newest Book: "+Book.getNewestBook(books).getTitle());
        Book.printYoungestWriter(books);
    }

}
