package Opdracht.Streams;

import java.util.Arrays;
import java.util.List;

public class MainApp1 {
    public static void main(String[] args) {

        Opdracht1 myObject = new Opdracht1();
        List<String> list = Arrays.asList("aalyiah","antonio","ana","abdulrahzzak","jon","adolph","bob","dylan","natalia","abu","abraham");

        //#1 UPPER CASE
        System.out.println(myObject.toUpperCase(list));
        //#2 ONLY STARTING WITH A
        System.out.println(myObject.filterA(list));
        //#3 STARING WITH A AND > 3
        System.out.println(myObject.filterB(list));
        //#4 STARING WITH A AND > 3 AND INVERSED ORDER
        System.out.println(myObject.filterC(list));
        //#5 STARING WITH A AND > 3 AND INVERSED ORDER AND RETURN STRING
        System.out.println(myObject.filterD(list));
        //#6 STARING WITH A AND > 3 AND INVERSED ORDER AND UPPER CASE AND RETURN STRING
        System.out.println(myObject.filterE(list));
        //#7 STARING WITH A AND > 3 AND INVERSED ORDER AND UPPER CASE AND RETURN STRING AND REMOVE CHARACTERS AFTER 10
        System.out.println(myObject.filterF(list));
        //#8 STARING WITH A AND > 3 AND INVERSED ORDER AND UPPER CASE AND RETURN STRING AND REMOVE CHARACTERS AFTER 10 AND ADD PREFIX AN SUFFIX
        System.out.println(myObject.filterG(list));
        //#9 STARING WITH A AND > 3 AND INVERSED ORDER AND UPPER CASE AND RETURN STRING AND REMOVE CHARACTERS AFTER 10 AND ADD PREFIX AN SUFFIX AND UNIQUE ID AS INDEX
        System.out.println(myObject.filterH(list));
        //#9 STARING WITH A AND > 3 AND INVERSED ORDER AND UPPER CASE AND RETURN STRING AND REMOVE CHARACTERS AFTER 10 AND ADD PREFIX AN SUFFIX AND UNIQUE ID AS INDEX AND RANDOM NUMBER
        System.out.println(myObject.filterI(list));

    }
}
