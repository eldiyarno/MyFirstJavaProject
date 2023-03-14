package pracitce;

import java.util.Scanner;

public class PracticeLogic2 {
    public static void main(String[] args) {
        Scanner word = new Scanner(System.in);
        System.out.println("Enter number");
        int a = word.nextInt();
        System.out.println("Enter second boolean: true/false");
        int b = word.nextInt();
        if (a>0&&b>0){
            System.out.println("a and b are positive");
        } else if (a==0||b==0) {
            System.out.println("Either a or b is zero");
        } else if (a<0&&b<0) {
            System.out.println("Both are negative");

        }else {
            System.out.println("One is positive, the other is negative");
        }
    }
}
