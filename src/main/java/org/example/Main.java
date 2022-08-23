package org.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner( System.in);
        String testText;
        List<String> stringList = new ArrayList<> ();
        boolean isBreaked = false;
        while (!isBreaked) {

            testText = scanner.nextLine();
            testText.length ();
            stringList.add ( testText );
            if (testText.equals ( "break" ) ) {
                isBreaked = true;
            }
        }
        System.out.println ("Finished!!!");
        for (String item : stringList) {
            if (item.length () == 5 || item.contains ( "s" )) {
                System.out.println (item);
            }
        }
    }
}