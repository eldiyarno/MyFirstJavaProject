package ifElse;

import java.util.Scanner;
import java.util.SortedMap;

public class ZipCode {
    public static void main(String[] args) {
        Scanner word = new Scanner(System.in);
        System.out.println("Enter zip code: XXXXX");
        int zipcode =word.nextInt();
        String zip = zipcode+"";
        if ((zipcode>0)&&!zip.contains("9")&&(zipcode+"").length()==5){
            System.out.println("The entered zip code is valid");
        }else {
            System.out.println("The entered zip code is invalid");
        }
    }
}
