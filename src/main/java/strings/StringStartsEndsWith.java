package strings;

public class StringStartsEndsWith {
    public static void main(String[] args) {
        String banner = "ThanksGiving Sale 20%";
        boolean isSale = banner.startsWith("Thanks");
        System.out.println(isSale); //true
        System.out.println(banner.startsWith("thanks"));
        System.out.println(banner.startsWith("T"));

        boolean endsWith = banner.endsWith("%");
        System.out.println(endsWith); //true

        System.out.println(banner.endsWith("Sale 20%")); //false
        System.out.println(banner.endsWith("sale 20%")); //false
    }
}
