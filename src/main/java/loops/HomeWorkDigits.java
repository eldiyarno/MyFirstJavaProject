package loops;

import java.util.Scanner;

public class HomeWorkDigits {
    public static void main(String[] args) {
        Scanner word = new Scanner(System.in);
        int counter;
        String w;
        do {
            System.out.println("Enter string with digits");
            w = word.nextLine();
            counter = word.nextInt();
            System.out.println("Number of digits; " + counter);
            for (int i = 0; i<=counter; i++){

            }


        }while (counter!=3);

    }
}
