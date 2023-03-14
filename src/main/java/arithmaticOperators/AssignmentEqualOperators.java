package arithmaticOperators;

public class AssignmentEqualOperators {
    public static void main(String [] args){
        /*

        = assignment operator (when you give value to variable)

        == equal equal operator (compares two variables if they are equal or not)

        != not equal operator (compares if two variables are not equal)

         */
        int number1 = 10;// assignment
        int number2 = 8;
        System.out.println(number2 == number1);
        System.out.println(100==100);
        boolean isEqual = 100==100+1;
        System.out.println(isEqual);

        boolean isEven;// if number can be divided by 2
        isEven = 80 % 2 == 0;
        System.out.println(isEven);






    }
}
