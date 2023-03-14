package pracitce;

import java.util.Scanner;

public class AscendingOrder {
    public static void main(String[] args) {
        Scanner word = new Scanner(System.in);
        int a = word.nextInt();
        int b = word.nextInt();
        int c = word.nextInt();
        int d = word.nextInt();
        if (a<b&&c<d){
            System.out.println("Ascending order");
        }else {
            System.out.println("Descending");
        }
    }
}
