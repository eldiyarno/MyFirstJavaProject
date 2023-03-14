package problemSolving;

import java.util.Scanner;

public class Palindrom {

    public static void main(String[] args) {
        Scanner word = new Scanner(System.in);
        String ws = word.nextLine();
        boolean tr = true;
        for (int i =0; i<ws.length()/2; i++){
            if ((ws.charAt(i)!=ws.charAt(ws.length()-i-1))) {
                tr = false;

            }if (tr){
                System.out.println("It's palindrome");
            }else {
                System.out.println("Not palindrome");
            }
        }
    }
}
