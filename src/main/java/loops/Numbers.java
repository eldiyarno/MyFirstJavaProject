package loops;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner word = new Scanner(System.in);
        int sums = 0;
        int g;
        int numberofNumber = 0;
        do {
            System.out.println("Enter negative number(or negative to quit): ");
            g = word.nextInt();
            if (g<0){

               break;
            } else if (g==0) {
                continue;

            }
            sums+=g;
            numberofNumber++;


        }while (true);
        System.out.println(sums);
    }
}
