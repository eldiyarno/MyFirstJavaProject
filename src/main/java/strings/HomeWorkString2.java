package strings;

public class HomeWorkString2 {
    public static void main(String[] args) {
        String hello1 = "Hello World!";

        String hello2 = "Hello world!";

        String hello3 = new String("HelloWorld!");

        boolean re = hello1.equalsIgnoreCase(hello2);
        System.out.println(re);
        //2
        boolean rs = hello1==hello2;
        System.out.println(rs);
        //3
        System.out.println(hello1.equals(hello2));
        //4
        String ss = hello1.toLowerCase();
        String ff = hello2.toLowerCase();
        System.out.println(ss.equals(ff));
        //5
        ss = hello1.toUpperCase();
        ff = hello2.toUpperCase();
        System.out.println(ss==ff);

    }
}
