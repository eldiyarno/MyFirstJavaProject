package strings;

public class StringToLowerCase {
    public static void main(String[] args) {
        String word = "Hello EveryOne! How ARE yoU doinG";
        word = word.toLowerCase();// converts to lower case
        System.out.println(word);

        String word2 = "hello guys, I am good. And you!";
        word2 = word2.toUpperCase();
        System.out.println(word2);

        boolean ss = word.equalsIgnoreCase(word2);
        System.out.println(ss);

        String word3 = "hello everyone";
        String word4 = "HELLO everyone";
        System.out.println(word3.equalsIgnoreCase(word4));

    }
}
