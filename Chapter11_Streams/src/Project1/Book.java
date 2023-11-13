package Project1;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

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
        Person[] person       = Arrays.stream(books).map(Book::getAuthor).toArray(Person[]::new);
        Person youngestWriter = (Person)Arrays.stream(person).sorted(Comparator.comparing(Person::getDateOfBirth).reversed()).toArray()[0];
        System.out.println("Youngest writer: " +youngestWriter.getFirstName()+" "+youngestWriter.getLastName());
    }
    public static void printSortedByTitle(Book[] books){
        Book[] booksAlphabeticalOrder = Arrays.stream(books).sorted(Comparator.comparing(Book::getTitle)).toArray(Book[]::new);
        for (Book b : booksAlphabeticalOrder){
            System.out.println(b.title);
        }
    }
    public static void countBooksPerAuthor(Book[] books){
        Map<Person, Integer> booksPerAuthor = new HashMap<>();

        for (Book book : books) {
            Person author = book.getAuthor();
            booksPerAuthor.put(author, booksPerAuthor.getOrDefault(author, 0) + 1);
        }

        // Imprimer le résultat
        booksPerAuthor.forEach((author, count) ->
                System.out.println(author.getFirstName() + " " + author.getLastName() + ": " + count + " books"));
    }
    public static void printBooksReleasedIn2016(Book[] books){
        Book[] booksReleasedIn2016 = Arrays.stream(books).filter(b->b.getReleaseDate().getYear() == 2016).toArray(Book[]::new);
        for (Book b : booksReleasedIn2016){
            System.out.println(b.title+" by "+b.getAuthor().getFirstName()+" "+b.getAuthor().getLastName());
        } //
    }
}