package loops;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner word = new Scanner(System.in);
        int number1;
        int number2;
        String arithmeticOperator;
        boolean yesno =true;
        
        do {
            System.out.println("Please enter any number");
            number1 =word.nextInt();
            System.out.println("Please enter any arithmetic operator; / * + - %");
            arithmeticOperator=word.next();
            System.out.println("Please enter any number");
            number2 = word.nextInt();
            if (arithmeticOperator.equals("/")){
                System.out.println(number1+" / "+number2+" = "+(number1/number2));
            } else if (arithmeticOperator.equals("*")){
                System.out.println(number1+" * "+number2+" = "+(number1*number2));
                
            } else if (arithmeticOperator.equals("+")) {
                System.out.println(number1+" + "+number2+" = "+(number1+number2));
            }else if (arithmeticOperator.equals("-")) {
                System.out.println(number1+" - "+number2+" = "+(number1-number2));
            }else if (arithmeticOperator.equals("%")) {
                System.out.println(number1+" % "+number2+" = "+(number1%number2));
            }
                System.out.println("Do you want to calculate again?");
            yesno=word.nextBoolean();
                if (yesno);


        }while (yesno);

        
    }
}
