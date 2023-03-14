package pracitce;

import java.util.Scanner;

public class ReplaceVowels {
    public static void main(String[] args) {
        Scanner word  = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = word.nextLine();
        sentence =sentence.replaceAll("[aieuyoAIEUYO]", "X");
        System.out.println(sentence);
    }
}
