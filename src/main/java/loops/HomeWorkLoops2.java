package loops;

import java.util.Scanner;

public class HomeWorkLoops2 {
    public static void main(String[] args) {
        Scanner word = new Scanner(System.in);
        String w = word.nextLine();
        boolean st = true;
        for (int i =0; i<w.length()/2; i++ ){
         if (w.charAt(i)!=w.charAt(w.length()-i-1)) {
             st = false;
             break;


         }if (st){
                System.out.println("It's palindrome");
            }else {
                System.out.println("Not palindrome");
            }
        }

    }
}
