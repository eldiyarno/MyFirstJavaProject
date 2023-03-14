package problemSolving;

import java.util.Scanner;

public class Frequencies {
    public static void main(String[] args) {
        Scanner word = new Scanner(System.in);
        System.out.println("Enter any word");
        String rs = word.nextLine();
        for (int i = 0; i<rs.length(); i++){
            int counter = 0;
            for (int k = 0; k<rs.length(); k++) {

                if (rs.charAt(i) == rs.charAt(k)) {
                    counter++;
                }
            }
                System.out.println(rs.charAt(i) + ": " + counter);


            }

        }




        }



