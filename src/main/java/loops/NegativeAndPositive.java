package loops;

import java.util.Scanner;

public class NegativeAndPositive {
    public static void main(String[] args) {
        Scanner word = new Scanner(System.in);
        System.out.println("Enter negative number");
        int r =word.nextInt();
        System.out.println("Enter positive number");
        int s = word.nextInt();
        for (int i = r; i<=s; i++){
            if (i<0&&i%2==0){
                continue;

            } else if (i>0&&i%2!=0) {
                continue;

            }
            System.out.println(i);

        }
    }
}
