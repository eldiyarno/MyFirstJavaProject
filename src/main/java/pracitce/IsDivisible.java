package pracitce;

import java.util.Scanner;

public class IsDivisible {
    public static void main(String[] args) {
        Scanner words = new Scanner(System.in);
        System.out.println("Enter numbers");
        int num1 = 10;
        int num2 = 5;

        if (num1%num2==0){
            System.out.println("Divisible");
        }else {
            System.out.println("Not divisible");
        }
    }
}
