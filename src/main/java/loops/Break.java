package loops;

import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        Scanner word = new Scanner(System.in);
        System.out.println("Enter any number:");
        int number = word.nextInt();
        int limit = 40;
        for (int i = 1; i<=number; i++){
            System.out.println(i);
            if (i>40){
                break;
            }
            System.out.println(i);
        }
        System.out.println("After loop");
    }
}
