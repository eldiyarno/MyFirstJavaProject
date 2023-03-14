package ifElse;

public class HomeWorkIfElse2 {
    public static void main(String[] args) {
        int num1 = 5;

        int num2 = 7;

        int num3 = 5;

        if (num1==num2||num2==num3||num1==num3){
            System.out.println("Two numbers are equal");
        }else {
            System.out.println("None of them are equal");
        }
        //2
        int num = 9;
        if (num %3 == 0|| num % 5 ==0){
            System.out.println("Multiple of 3 or 5");
        }else {
            System.out.println("Multiple of 3 or 5" );
        }
        //3
        int nums = 4;
        int nums1 = 3;
        int nume =nums+nums1;

        if (nume%2==0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
        //4
        int numq = 7;
        if (numq%1==0){
            System.out.println("prime");
        }else {
            System.out.println("Not prime");
        }
    }
}
