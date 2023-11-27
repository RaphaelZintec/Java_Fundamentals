package LinkedListOefeningen;

import java.util.LinkedList;

public class Oef2<T> extends LinkedList{
    public static void main(String[] args) {
        Oef2<String> sentence = new Oef2<String>();
        sentence.add("Java");
        sentence.add("is");
        sentence.add("known");
        sentence.add("for");
        sentence.add("its");
        sentence.add("platform");
        sentence.add("independence");

        sentence.printSentence();
        System.out.println();
        sentence.printSentenceInReverseOrder();
        System.out.println();
        sentence.printNumberOfWords();
    }

    public void printSentence(){
        this.forEach(s-> System.out.print(s+" "));
    }
    public void printSentenceInReverseOrder(){
        this.reversed().forEach(s-> System.out.print(s+" "));
    }
    public void printNumberOfWords(){
        System.out.println(this.stream().count());
    }
}
