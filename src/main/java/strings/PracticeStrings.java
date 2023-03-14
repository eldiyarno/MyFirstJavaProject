package strings;

import java.nio.charset.StandardCharsets;

public class PracticeStrings {
    public static void main(String[] args) {
        String singerName = "Michael Jackson";
        System.out.println(singerName.length());//returns number of chars
        System.out.println(singerName.endsWith("on"));//true
        System.out.println(singerName.startsWith("Misha"));//false
        System.out.println(singerName.isEmpty());//checks is it empty or not
        System.out.println(!singerName.isEmpty());//true
        System.out.println(singerName.toLowerCase());
        System.out.println(" "+singerName.charAt(0)+singerName.charAt(3));
        System.out.println(singerName.indexOf("c"));
        System.out.println(singerName.indexOf("c",3));
        System.out.println(singerName.indexOf("W"));//-1

        String singerName2 = "Justin Bieber";
        boolean areTheSame = singerName2.equals(singerName);// false
        System.out.println(areTheSame);
        System.out.println(!singerName.equals(singerName2));//true
        System.out.println(singerName==singerName2);//true






    }
}
