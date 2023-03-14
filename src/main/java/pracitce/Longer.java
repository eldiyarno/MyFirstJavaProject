package pracitce;

import java.util.Scanner;

public class Longer {
    public static void main(String[] args) {
        Scanner word = new Scanner(System.in);
        System.out.println("Enter two strings");
        String q1 =word.nextLine();
        String q2 = word.nextLine();
        if (q1.length()>=q2.length()){
            System.out.println(q1.length());
            } else if (q2.length()>=q1.length()) {
            System.out.println(q2.length());

        }
    }
    }

