package loops;

import java.util.Scanner;

public class NegativeNumber {
    public static void main(String[] args) {
        Scanner word = new Scanner(System.in);
        int number;
        do {
                System.out.println("Enter even number");

                number = word.nextInt();
                if (number%2==0){
                    System.out.println();
                    break;
                }

        }while (number>1);
    }
}
