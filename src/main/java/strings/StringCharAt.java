package strings;

public class StringCharAt {
    public static void main(String[] args) {
        String city = "Chicago";
        System.out.println(city.length());
        System.out.println(city.charAt(6));

        String welcomeSign = "Hello everyone! Welcome to Chicago";
        char c = welcomeSign.charAt(14);
        char cc = welcomeSign.charAt(2);
        System.out.println(cc);
        char s =welcomeSign.charAt(0);
        System.out.println(s);
        System.out.println(welcomeSign.length());
        System.out.println(welcomeSign.charAt(welcomeSign.length()-1));
        System.out.println(welcomeSign.charAt(7+4-1));


    }
}
