package Project1;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

public class Book {
    public String title;
    public Person author;
    public LocalDate releaseDate;
    public String genre;

    public Book(String title, Person author, LocalDate releaseDate, String genre) {
        this.title = title;
        this.author = author;
        this.releaseDate = releaseDate;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public Person getAuthor() {
        return author;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public String getGenre() {
        return genre;
    }


    public static Book getNewestBook(Book[] books){
        return (Book)Arrays.stream(books).sorted(Comparator.comparing(Book::getReleaseDate).reversed()).toArray()[0];

    }
    public static void printYoungestWriter(Book[] books){
        Person person = ((Book)Arrays.stream(books).sorted(Comparator.comparing(obj -> obj.getAuthor().getDateOfBirth())).toArray()[0]).getAuthor();
        System.out.println("Youngest writer: " +person.firstName+" "+person.lastName);
    }
    public static void printSortedByTitle(Book[] books){
    }
    public static void countBooksPerAuthor(Book[] books){
    }
    public static void printBooksReleasedIn2016(Book[] books){
    }
}
