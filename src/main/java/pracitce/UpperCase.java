package pracitce;

import java.util.Scanner;

public class UpperCase {
    public static void main(String[] args) {
        Scanner word = new Scanner(System.in);
        System.out.println("Enter words");
        String woro = word.nextLine();
        if (woro==woro.toUpperCase()){
            System.out.println("Upper case");
        }else{
            System.out.println("Not Upper case");
        }
    }
}
