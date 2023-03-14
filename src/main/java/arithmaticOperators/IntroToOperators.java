package arithmaticOperators;

public class IntroToOperators {
    public static void main (String [] args){
        int a = 10;
        int b = 5;
        int c = a + b;
        System.out.println(c);
        c = a - b;
        System.out.println(c);
        c = a + a + a;
        System.out.println(c);
        a = c - b;
        System.out.println(a);

        a = 100;
        b = 25;
        c = 10;
        System.out.println(a+" / "+ c + " = "+c);
        System.out.println(b+" * "+c+" = "+b*c);
        System.out.println(a+" + "+b+" - "+c+" = "+(a +b-c));

        int num1 = 20;
        int num2 = 50;
        int num3 = 100;
        int result = num1 + num2 * num3;
        System.out.println(result);

    }
}
