package scanner;

import java.util.Scanner;

public class Season {
    public static void main(String[] args) {
        Scanner month = new Scanner(System.in);
        System.out.println("Enter the name of the month");
        String month1 = month.next();
        if (month1.equalsIgnoreCase("January")) {
            System.out.println("Winter");
        } else if (month1.equalsIgnoreCase("February")) {
            System.out.println("Winter");

        } else if (month1.equalsIgnoreCase("March")) {
            System.out.println("Spring");
        } else if (month1.equalsIgnoreCase("April")) {
            System.out.println("Spring");
        } else if (month1.equalsIgnoreCase("May")) {
            System.out.println("Spring");
        } else if (month1.equalsIgnoreCase("June")) {
            System.out.println("Summer");
        } else if (month1.equalsIgnoreCase("July")) {
            System.out.println("Summer");
        } else if (month1.equalsIgnoreCase("August")) {
            System.out.println("Spring");
        } else if (month1.equalsIgnoreCase("September")) {
            System.out.println("Fall");
        } else if (month1.equalsIgnoreCase("Oktober")) {
            System.out.println("Fall");
        } else if (month1.equalsIgnoreCase("November")) {
            System.out.println("Fall");
        } else if (month1.equalsIgnoreCase("December")) {
            System.out.println("Fall");
        } else {
            System.out.println("I don't care");

        }
    }
}
