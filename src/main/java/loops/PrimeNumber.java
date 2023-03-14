package loops;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner word = new Scanner(System.in);
        System.out.println("Enter a number");
       int number = word.nextInt();
       boolean isPrime = false;
       for (int f =2; f<number; f++){
           if (number%f==0) {
               isPrime = false;
               break;

           }if (isPrime){
               System.out.println("Prime number");
           }else {
               System.out.println("Not prime number");
           }
       }

    }
}
