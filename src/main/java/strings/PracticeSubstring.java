package strings;

public class PracticeSubstring {
    public static void main(String[] args) {
        String first_name = "Jacob";
        String last_name = "Coffee";

        System.out.println(" "+first_name.charAt(0)+last_name.charAt(4)+last_name.charAt(5));
        System.out.println(" "+last_name.charAt(0)+last_name.charAt(4)+last_name.charAt(5));
        System.out.println(" "+first_name.charAt(0)+first_name.charAt(1)+last_name.charAt(1)+last_name.charAt(4)+last_name.charAt(5));
        System.out.println(last_name.toUpperCase().charAt(2)+last_name.substring(4)+first_name.substring(2,4));
    }
}
