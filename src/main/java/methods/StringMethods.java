package methods;

public class StringMethods {
    static boolean compareStrings (String str1, String str2){
        if (str1.equals(str2)){
            return true;

        }else {
            return false;
        }
    }

    static String concatenatedString (String st, String st2){
        return st.toUpperCase()+st2.toUpperCase();


    }
    static int lengthOfConcatenated (String s2, String s3){
        return (s2+s3).length();
    }
    public static boolean evenOrNot (int s1){
        if (s1%2==0){
            return true;
        }else {
            return false;
        }
    }
    public static boolean isDivisible (int ss){
        return ss % 10 == 0;
    }
    public static void multiplicationOfInt (int a){
        for (int i = 1; i<=10; i++){

            System.out.println(a+" * "+i+" = "+(a*i));
        }
    }
    static int largestOne(int a, int b){
        if (a>b){
            System.out.println(a);
            return a;

        }
        System.out.println(b);
        return b;
    }
    static int average (int a, int b, int c, int d){
        return (a+b+c+d)/4;
    }
    static int sumOfAllNumbers (int a ){
        int sum = 0;
        for (int i = 1; i<=a; i++){

            sum += i;


        }return sum;
    }

    public static void main(String[] args) {
        boolean isSame =compareStrings("hello","hello");
        System.out.println(isSame);
        String s = concatenatedString("Hello","World");
        System.out.println(s);
        multiplicationOfInt(4);
        System.out.println(sumOfAllNumbers(7));
    }
}
