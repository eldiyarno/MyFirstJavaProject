package strings;

public class HomeWorkManipulation2 {
    public static void main(String[] args) {
        String phrase = "Hello Mofos, What's up?";
        System.out.println(phrase.endsWith("up!"));

        System.out.println(phrase = phrase.substring(20,23));
        //3
        String phrase1 = "Hello Mofos, What's up?";
        phrase1 = phrase1.replace("e","a");
        System.out.println(phrase1);
        //4
        System.out.println(phrase1.substring(6,11));
        //5
        System.out.println(phrase1.indexOf("?"));
        //6
        String phrase2 = "Hello gide?";
        System.out.println(phrase2.startsWith("hello?"));
        //7
        System.out.println(phrase2.replace("H","D"));
        //8
        System.out.println(phrase2.indexOf("l"));
        //9
        String phrase3 = "     This is  Chi!";
        System.out.println(phrase3.trim());
        //10
        System.out.println(phrase3.toUpperCase());





    }
}
