package loops;

import java.util.Scanner;

public class PrimeWhile {
    public static void main(String[] args) {
        Scanner word = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = word.nextInt();
        boolean t = true;
        int f = 2;
        while (f<number){
            if (number%f==0) {
                t = false;
               break;
            }
            f++;
                }
        if (t){
            System.out.println("Prime number");
        }else {
            System.out.println("Not prime");
            }
        }
    }

