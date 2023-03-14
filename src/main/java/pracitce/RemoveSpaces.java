package pracitce;

import java.util.Scanner;

public class RemoveSpaces {
    public static void main(String[] args) {
        Scanner word = new Scanner(System.in);
        System.out.println("Enter word");
        String sentence =word.nextLine();
        System.out.println(sentence.replace(" ", ""));
    }
}
