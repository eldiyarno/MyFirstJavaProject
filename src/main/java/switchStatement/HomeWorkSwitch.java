package switchStatement;

import java.util.Scanner;

public class HomeWorkSwitch {
    public static void main(String[] args) {
        Scanner word = new Scanner(System.in);
        System.out.println("Enter a symbol");
        String next = word.nextLine();
        switch (next){
            case "!":
                System.out.println("exclamation mark");
                break;
            case "?":
                System.out.println("Question mark");
                break;
            case "%":
                System.out.println("Modulus");
                break;
            case "#":
                System.out.println("Hash");
                break;
            case "*":
                System.out.println("Star");
                break;
            case "@":
                System.out.println("At");
                break;
            case "$":
                System.out.println("Dollar sign");
                break;
            default:
                System.out.println("Please enter valid symbol");

        }

    }
}
