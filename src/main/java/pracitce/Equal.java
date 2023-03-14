package pracitce;

import java.util.Scanner;

public class Equal {
    public static void main(String[] args) {
        Scanner word = new Scanner(System.in);
        System.out.println("Enter string");
        String w = word.nextLine();
        String q = word.nextLine();
        if (w.equalsIgnoreCase(q)) {
            System.out.println("Equal");
        }else {
            System.out.println("Not equal");

        }
    }
}
