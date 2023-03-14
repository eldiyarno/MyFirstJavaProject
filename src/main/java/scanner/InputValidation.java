package scanner;

import java.util.Scanner;

public class InputValidation {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Please enter number");
        int r = number.nextInt();
        System.out.println("Valid");

        if (r<=1&&r>=10){
            System.out.println("The number");
        }else {
            System.out.println("invalid");
        }

    }
}
