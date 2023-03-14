package loops;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        Scanner word = new Scanner(System.in);
        System.out.println("Enter any word");
        String w = word.nextLine();
        String a = "";
        for (int i = w.length()-1; i>=0; i--){
            a += w.charAt(i);

        }
        System.out.println(a);
    }
}
