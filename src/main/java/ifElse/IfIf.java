package ifElse;

public class IfIf {
    public static void main(String[] args) {
        String weather = "warm and rainy";
        if (weather.equals("cold,")){
            System.out.println("cold, stay home!");
        }else if (weather.equals("warm")){
            System.out.println("warm, go out");
        } else if (weather.equals("rainy")){
            System.out.println("rainy, stay home");

        }else {
            System.out.println("party hard");
        }
    }
}
