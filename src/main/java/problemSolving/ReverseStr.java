package problemSolving;

import java.util.Scanner;

public class ReverseStr {
    public static void main(String[] args) {
        Scanner word = new Scanner(System.in);
        String ws = word.nextLine();
        String reverse = "";
        for (int i =ws.length()-1; i>=0; i--){
            reverse+=ws.charAt(i);

        }
        System.out.println(reverse);
    }
}
