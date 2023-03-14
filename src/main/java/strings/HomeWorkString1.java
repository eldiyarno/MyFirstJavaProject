package strings;

public class HomeWorkString1 {
    public static void main(String[] args) {
        String message = "Hello everyone, Let's do Java String exercises";
       //1
        char dd = message.charAt(10);
        System.out.println(dd);
        //2
        System.out.println(message.length());
        //3
        System.out.println(message.toUpperCase());
        //4
        System.out.println(message.toLowerCase());
        //5
        char rr = message.charAt(5);
        System.out.println(rr);
        //6
        System.out.println(message.charAt(message.length()-1));
        //7
        String first = message.substring(0,1).toLowerCase();
        System.out.println(first);
        //8
        String last = message.substring(45).toUpperCase();
        System.out.println(last);






    }
}
