package loops;

import java.util.Locale;
import java.util.Scanner;

public class DoWhileStr {
    public static void main(String[] args) {
        Scanner word = new Scanner(System.in);
        int vowels;
        String wors;
        do {
            System.out.println("Enter a string with 10 vowels");
            wors=word.nextLine();
            vowels=0;
            for (int i = 0; i< wors.length();i++){
                wors = wors.toLowerCase();
                if (wors.charAt(i)=='a'||wors.charAt(i)=='e'||wors.charAt(i)=='o'||wors.charAt(i)=='i'||wors.charAt(i)=='u'){
                    vowels++;
                }

            }
            System.out.println("The entered word's vowel count;"+vowels);

        }while (vowels<10);
    }
}
