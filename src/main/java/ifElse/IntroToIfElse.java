package ifElse;

public class IntroToIfElse {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        System.out.println("I will compare a and b below");

        if (a>b){
            System.out.println("a is more than b");
        } else {
            System.out.println("a is less than b");
        }
        System.out.println("I already compared a and b");
        int number1 = 100;
        int number2 = 50;

        if(number1/number2==2) {
            System.out.println("YES, two!");
        }
            else {
            System.out.println("Not two!");

            }
            String elon = "Tesla SpaceX Paypal Twitter";
            if (elon.contains("Paypal")){
                System.out.println("Elon owned Paypal");
        }else {
                System.out.println("Elon did now own Paypal");
            }

            String polo = "What in the hell?";
            if(polo.contains("What")){
                System.out.println("Yes,please");
        }else {
                System.out.println("No,please");
            }
            if (polo.endsWith("l")){
                System.out.println("NO");
            }else {
                System.out.println("YES");
            }
            if(polo.startsWith("What")){
                System.out.println("Probably");
            }else{
                System.out.println("Nope");
            }
            int d = 150;
            int p = 100;
            if(d>p){
                System.out.println("Close it");
            }else {
                System.out.println("No more");
            }
            if(d-p==50){
                System.out.println("Nothing");
            }else {
                System.out.println("Something");
            }




    }
}
