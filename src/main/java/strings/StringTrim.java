package strings;

public class StringTrim {
    public static void main(String[] args) {
        /*
        trim() method removes empty spaces from both ends of the String
         */
        String batch = "   Batch 2 is cool           ";
        batch =batch.trim();
        System.out.println(batch);
        System.out.println(batch.contains("cool"));//true
        System.out.println(batch.contains("ssss")); //false

    }
}
