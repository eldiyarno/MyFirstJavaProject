package strings;

public class StringSubstring {
    public static void main(String[] args) {
        String message = "Hello Chicago, why are you so cold and windy?";
        String city = message.substring(6,13); //taking Chicago
        System.out.println(city);
        String question = message.substring(15); //taking from 15
        System.out.println(question);

        String welcomeSign ="Welcome to USA, our population is 140 million people, the average salary " +
                "is 90k dollars, and our president is Joe Biden";
        String country = welcomeSign.substring(11,14);
        System.out.println(country);
        String population = welcomeSign.substring(welcomeSign.indexOf("140"), welcomeSign.indexOf(" people,"));
        System.out.println(population);
        String salary = welcomeSign.substring(welcomeSign.indexOf("90k" ),welcomeSign.indexOf("dollars, "));
        System.out.println(salary);

        String phrase = "Just one positive thought in the morning can change your whole day.";
        String phrase1 = phrase.substring(0,5);
        String phrase2 = phrase.substring(18,26);
        System.out.println(phrase1);
        System.out.println(phrase2);
        System.out.println(phrase1+" a "+phrase2);
        //
        System.out.println(phrase.substring(9,17)+" "+phrase.substring(32,40));
        System.out.println(phrase.substring(57,62)+" "+phrase.substring(32,40));

        int oo = phrase.indexOf("morning");
        System.out.println(oo);
        int pp = phrase.indexOf("day");
        System.out.println(pp);
        String dos = phrase.substring(33,40);
        String pss = phrase.substring(63,67);
        System.out.println(dos+" "+pss);
        //=========================================================================
        String str1 = "hi";
        String str2 = "bye";
        System.out.println(str1+str2+str1+str2);
        System.out.println(str1+" "+str2+" " +str1.toUpperCase()+" "+str1.toUpperCase()+" "+str2.toUpperCase()+" "+str2.toUpperCase()+" "+str1);
        System.out.println(str2.substring(0,1)+str1.substring(1));
        System.out.println(str1.replace('h','b'));

        String see = "see";
        String hear = "hear";
        System.out.println(see.substring(0,1)+hear.substring(1));
        System.out.println(hear.replace('h','s'));
        System.out.println(" "+see.charAt(0)+hear.charAt(1)+hear.charAt(2)+hear.charAt(3));
















    }
}
