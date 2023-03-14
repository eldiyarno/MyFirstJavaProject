package strings;

public class StringEquals {
    public static void main(String[] args) {
        String country = "USA";
        String country2 = "USA";
        String country3 = new String ("USA");
        System.out.println(country==country2);//True
        System.out.println(country==country3);//false

        System.out.println(country.equals(country3));//true

    }
}
