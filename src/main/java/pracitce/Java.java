package pracitce;

import java.util.Scanner;

public class Java {
    public static void main(String[] args) {
        Scanner word = new Scanner(System.in);
        System.out.println("Enter any word");
        String wsrods = word.nextLine();
        if (wsrods.contains("java")){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
