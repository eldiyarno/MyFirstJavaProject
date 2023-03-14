package switchStatement;

import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
        Scanner word = new Scanner(System.in);
        System.out.println("Enter a grade");
        String w = word.nextLine();
        switch (w){
            case "A":
                System.out.println("Perfect");
                break;
            case "B":
                System.out.println("Good job");
                break;
            case "C":
                System.out.println("Not bad");
                break;
            case "D":
                System.out.println("Relax man");
            default:
                System.out.println("Wrong Grade");
        }

    }
}
