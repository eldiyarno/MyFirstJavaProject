package loops;

import java.util.Scanner;

public class HomeWorkBreak {
    public static void main(String[] args) {
        Scanner word = new Scanner(System.in);
        System.out.println("Enter a positive integer");
        int w = word.nextInt();
        boolean toto = false;
        for (int i = 0; i < w; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                System.out.println(i);
                toto = true;


            }
                }if (!toto) {

                    System.out.println("There are no integers that meet the criteria");


            }if (w<=0){
            System.out.println("Error");

        }
    }
}

