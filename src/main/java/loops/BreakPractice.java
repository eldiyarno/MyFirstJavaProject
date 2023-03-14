package loops;

import java.util.Scanner;

public class BreakPractice {
    public static void main(String[] args) {
        Scanner word = new Scanner(System.in);
        System.out.println("Enter any number");
        int r = word.nextInt();
        System.out.println("Enter any number");
        int s = word.nextInt();
        int sum = r + s;
        for (int i = 1; i <= sum; i++) {
            if (i == 45) {

                break;
            }
            System.out.println(i);
        }


    }
}
