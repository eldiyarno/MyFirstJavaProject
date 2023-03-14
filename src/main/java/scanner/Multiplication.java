package scanner;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner ti = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = ti.nextInt();
        System.out.println("Enter second number");
        int num2 = ti.nextInt();
        System.out.println("Enter third number");
        int num3 = ti.nextInt();
        System.out.println("The sum "+(num1*num2)*num3);
    }
}
