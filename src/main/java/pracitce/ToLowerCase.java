package pracitce;

import java.util.Scanner;

public class ToLowerCase {
    public static void main(String[] args) {
        Scanner word = new Scanner(System.in);
        System.out.println("What' up?");
        String sr = word.nextLine();
        System.out.println(sr.toLowerCase());
    }
}
