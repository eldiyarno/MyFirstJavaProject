package ifElse;

import java.util.Scanner;

public class ContainsE {
    public static void main(String[] args) {
        Scanner sentence = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = sentence.nextLine();
        if (word.contains("e")){
            System.out.println(word.indexOf("e"));
        }else {
            System.out.println("The word does not contain the letter e");
        }


    }
}
