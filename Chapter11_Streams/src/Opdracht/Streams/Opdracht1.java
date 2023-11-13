package Opdracht.Streams;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class Opdracht1 {

    //#1
    public List toUpperCase(List<String> strings) {
        return strings.stream().map(String::toUpperCase).collect(Collectors.toList());
    }

    //#2
    public List filterA(List<String> strings) {
        return strings.stream().filter(n->n.startsWith("a")).collect(Collectors.toList());
    }

    //#3
    public List filterB(List<String> strings) {
        return strings.stream().filter(n->n.startsWith("a")).filter(n->n.length()>3).collect(Collectors.toList());
    }

    //#4
    public List filterC(List<String> strings) {
        return strings.stream().filter(n->n.startsWith("a")).filter(n->n.length()>3).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }

    //#5
    public String filterD(List<String> strings) {
        return strings.stream().filter(n->n.startsWith("a")).filter(n->n.length()>3).sorted(Comparator.reverseOrder()).collect(Collectors.joining(", "));
    }

    //#6
    public String filterE(List<String> strings) {
        return strings.stream().filter(n->n.startsWith("a")).filter(n->n.length()>3).sorted(Comparator.reverseOrder()).collect(Collectors.joining(", ")).toUpperCase();
    }

    //#7
    public String filterF(List<String> strings) {
        return strings.stream().filter(n->n.startsWith("a")).filter(n->n.length()>3).map(n-> n.length()>10 ? n.substring(0,10) : n).sorted(Comparator.reverseOrder()).collect(Collectors.joining(", ")).toUpperCase();
    }

    //#8
    public String filterG(List<String> strings) {
        return strings.stream()
                .filter(n->n.startsWith("a"))
                .filter(n->n.length()>3)
                .map(String::toUpperCase)
                .map(n-> n.length()>10 ? n.substring(0,10) : n)
                .map(n-> "---" +n+ "---")
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining(", "));
    }

    //#9
    public String filterH(List<String> strings) {
        final int[] i = {0};
        return strings.stream()
                .filter(n->n.startsWith("a"))
                .filter(n->n.length()>3)
                .map(String::toUpperCase)
                .map(n-> n.length()>10 ? n.substring(0,10) : n)
                .sorted(Comparator.reverseOrder())
                .map(n ->  ++i[0]+"---" +n+ "---")
                .collect(Collectors.joining(", "));
    }

    //#10
    public String filterI(List<String> strings) {
        final int[] i = {0};
        Random random = new Random();
        return strings.stream()
                .filter(n->n.startsWith("a"))
                .filter(n->n.length()>3)
                .map(String::toUpperCase)
                .map(n-> n.length()>10 ? n.substring(0,10) : n)
                .sorted(Comparator.reverseOrder())
                .map(n ->  "#"+random.nextInt(1000)+" "+(++i[0])+".---" +n+ "---")
                .collect(Collectors.joining(", "));
    }
}
