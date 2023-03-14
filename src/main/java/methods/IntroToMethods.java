package methods;

public class IntroToMethods {
    String getCapitalFrance(){

        /*
        void means does not return anything
        inside void method you can write any logic, anything
         */
        return "Paris";
    }
    double getPI(){
        return 3.14;
    }

    int getZero (){
        return 0;
    }
    char getLetter(){
        return 'a';
    }
    int getAreaOfRectangle(int length, int width){
        return length * width;

    }
    int getPerimeterOfTriangle (int a, int b, int c){
        return a+b+c;
    }
    static int lengthOfString (String str){
        return  str.length();

    }

    public static void main(String[] args) {
        IntroToMethods intro = new IntroToMethods();
        intro.getAreaOfRectangle(5,5);

        double areaOfRectangle = intro.getAreaOfRectangle(5,5);
       int length = lengthOfString("REAL");
        System.out.println(length);
    }

}
