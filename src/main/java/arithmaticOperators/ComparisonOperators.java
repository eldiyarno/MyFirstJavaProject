package arithmaticOperators;

import java.util.function.DoubleToIntFunction;

public class ComparisonOperators {
    public static void main(String[] args) {
        /*
        Comparison operators are used to compare 2 values;
        > more than
        < less than
        >= more or equal
        <= less or equal
        == equal
        != not equal
         */
        byte potato  = 5;
        byte fries = 10;
        System.out.println(potato>fries);
        System.out.println(potato<fries);
        System.out.println(potato >=fries);
        System.out.println(potato<=fries);


        byte t1 = 45;
        byte t2 = 78;
        short t3 = 111;
        short t4 = 444;
        int t5 = 777;
        int t6 = 321;
        long t7 = 7777;
        long t8 = 77777;

        System.out.println(t1 >t2);
        System.out.println(t4 < t3);
        System.out.println(t5 <= t8);
        System.out.println(t2 == t1);
        System.out.println(t8 > t2);
        System.out.println(t3 <= t8);
        System.out.println(t3>=t2);
        System.out.println(t6 >= t3);

        /*
        Concatenation works with Strings
         */
        System.out.println(1 + 2);
        System.out.println("hello"+ 1 +2);
        System.out.println((1+2==3) + "hello" + 4*5);

    }
}
