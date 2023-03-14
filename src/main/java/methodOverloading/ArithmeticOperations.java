package methodOverloading;

import static java.lang.Math.sqrt;
import static java.lang.Math.toIntExact;
import static methods.MethodsCreation.s;

public class ArithmeticOperations {
    public int sumOfNumbers(int a, int b){
        return a+b;
    }
    public int sumOfNumbers(int a, int b,int c) {
        return a + b + c;

    }public int sumOfNumbers(int a, int b, int c, int d) {
        return (a + b + c + d) / 4;
    }
    public int sumgitOfNumbers(int a, int b, int c, int d, int g, int y) {
        return (a + b + c + d + g + y) / 6;
    }
    public double getAreaOfTriangle (double base, double height){
        return 0.5 *base * height;
    }
     public int getAreaOfTriangle (int a, int b, int c){
        int s = a+b+c/2;
        int area = (int) sqrt(s *(s-a)*(s-b)*(s-c));
        return area;
    }

}
