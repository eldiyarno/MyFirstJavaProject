package pracitce;

import java.util.Scanner;

public class TrueOrFalse {
    public static void main(String[] args) {
        Scanner word = new Scanner(System.in);
        System.out.println("Enter; true/false");
        boolean a = word.nextBoolean();
        System.out.println("Enter; true/false");
        boolean b = word.nextBoolean();
        boolean c = word.nextBoolean();
        if (a && b &&!c){
            System.out.println("at least two of them are true");
        }if (!a&&!b&&c){
            System.out.println("Less than two are true");
        }if (a&&b&&c){
            System.out.println("All of them are true");
        }else {
            System.out.println("All false");
        }
    }
}
