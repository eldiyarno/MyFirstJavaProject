package pracitce;

import java.util.Scanner;

public class TwoNumbers {
    public static void main(String[] args) {
        Scanner word = new Scanner(System.in);
        System.out.println("Enter numbers");
        int q1 = word.nextInt();
        int q2 = word.nextInt();
        int q3 = word.nextInt();
        if ((q1>q2)&&(q2>q3)){
            System.out.println("First larger than others");
        }if ((q1<q2)&&(q2<q3)){
            System.out.println("Third number is larger than other");
        }else {
            System.out.println("Second larger");
        }
    }
}
