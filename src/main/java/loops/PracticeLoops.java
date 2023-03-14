package loops;

public class PracticeLoops {
    public static void main(String[] args) {
        for (int x = 10; x >= 1; x--) {
            System.out.println("The value of x is : " + x);
        }
        for (int x = 10; x >= 0; x = x - 2) {
            System.out.println("The value of x is : " + x);
        }
        for (int x = 1; x <= 15; x = x + 2) {
            System.out.println("The value of num : " + x);
        }
        int sum = 0;
        for (int x = 1; x <= 10; x++) {
            System.out.println("The value of x is : " + x);
            sum = sum + x;//1+2+3+4+5
        }
        System.out.println("The result is: "+sum);
        int srs = 0;
        for (int f = 0; f<=100; f=f+2){
            System.out.println(f);
            srs =srs+f;
        }
        System.out.println("The result: "+srs);
    }
}
