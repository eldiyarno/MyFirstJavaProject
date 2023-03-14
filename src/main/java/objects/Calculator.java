package objects;

public class Calculator {

     public int add(int x, int y){
         return x+y;
     }
     public int subtract(int x, int y){
         return x-y;
     }
     public int multiply(int x, int y){
         return x*y;
     }
     public double divide (double x, double y){
         if (y == 0) {
             return Double.POSITIVE_INFINITY;

         }
         return x/y;
     }
     public int modulus(int x, int y){
         return x%y;
     }

    public static void main(String[] args) {
        Calculator first = new Calculator();

        System.out.println(first.add(1,5));
        System.out.println(first.modulus(15,6));
        System.out.println(first.multiply(15,5));
        System.out.println(first.divide(15,0));
    }

}
