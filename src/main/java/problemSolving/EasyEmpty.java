package problemSolving;

import java.util.Scanner;

public class EasyEmpty {
    public static void main(String[] args) {
        Scanner word = new Scanner(System.in);
        String wes = word.nextLine();
        if (wes.isEmpty()){
            System.out.println("Empty");
        }else {
            System.out.println("Not empty");
        }
    }
}
