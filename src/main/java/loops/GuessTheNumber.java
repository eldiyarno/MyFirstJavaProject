package loops;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        int randomNumber = new Random().nextInt(1,100);
        int num;
        do {
            Scanner word = new Scanner(System.in);
            num = word.nextInt();
            if (num<randomNumber){
                System.out.println("Too low");
            }else if(num>randomNumber){
                System.out.println("Too High");
            }else {
                System.out.println("Correct");
            }
        }while (randomNumber!=num);


    }
}
