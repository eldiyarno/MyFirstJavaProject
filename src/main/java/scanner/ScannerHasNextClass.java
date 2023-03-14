package scanner;

import java.util.Scanner;

public class ScannerHasNextClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean b = sc.hasNext();
    }
}
