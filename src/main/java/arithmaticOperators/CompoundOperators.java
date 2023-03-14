package arithmaticOperators;

public class CompoundOperators {
    public static void main(String[] args) {
        int a = 5;
        a++; //a=a+1
        System.out.println(a);
        a++;
        System.out.println(a);
        a--;
        System.out.println(a);

        int age = 18;
        System.out.println(age++);//post increment
        System.out.println(++age);// 19 right away pre increment

        int money = 20;
        money +=3;//money=money + 3

        System.out.println(money);
        money +=5;
        System.out.println(money);
        money -=8;
        System.out.println(money);
        money /=4;
        System.out.println(money);

    }
}
