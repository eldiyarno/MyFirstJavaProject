package switchStatement;

import java.util.Scanner;

public class WeekDays {
    public static void main(String[] args) {
        int day = 5;
        switch (day){
            case 1:
                System.out.println("Weekday");
                break;
            case 2:
                System.out.println("Weekday");
                break;
            case 3:
                System.out.println("Weekday");
                break;
            case 4:
                System.out.println("Weekday");
                break;
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
                System.out.println("Weekend");
                break;
            case 7:
                System.out.println("Weekend");
            default:
                System.out.println("Enter valid number");
        }
        char letter = 'A';
        switch (letter){
            case 'A','E','I','O','U':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
        }

    }
}
