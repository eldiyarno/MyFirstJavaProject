package strings;

import java.nio.charset.StandardCharsets;
import java.sql.SQLOutput;

public class IntroToStrings {
    public static void main (String [] args){
        String pep = "What's up!";
        System.out.println(pep);
        String firstName = "Michael";
        String lastName = "Jackson";
        System.out.println(firstName);
        System.out.println(lastName);
        firstName = "Jason";
        lastName = "Kennedy";
        System.out.println(firstName +" "+lastName);

        String myName = "Eldiyar";
        String myLastName = "Batyrbekov";
        byte myAge = 23;
        String address = "7320 N Ridge Blvd";
        long mobilePhone = 8325033972l;
        String friendName ="Bobik";
        String city = "Chicago";
        System.out.println("I am"+" "+myName + " and "+"I am "+myAge);
        System.out.println(myLastName);
        System.out.println(myAge);
        System.out.println(address);
        System.out.println(mobilePhone);
        System.out.println(friendName);
        System.out.println(city);

        String fruit1 = "apple";
        String fruit2 = new String("banana");
        String polooooooo = "SEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE";
        System.out.println(polooooooo);
        //_________________________________________________________________________________________________________________

        System.out.println(city.length());
        System.out.println(polooooooo.length());
        System.out.println("The length of Antananarivo is; "+city.length());

        /*
        equals() method compares values of 2 Strings
         */
        String fruit3 = "apple";
        String fruit5 = "apple";
        String fruit0 = "Apple";
        boolean isSame = fruit3.equals(fruit5);
        System.out.println(isSame);

        isSame = fruit3.equals(fruit0);
        System.out.println(isSame);

        fruit1 = "banana";
        fruit2 = "orange";
        System.out.println(fruit1.equals(fruit2));
        boolean isSame2 = !fruit1.equals(fruit2);// ! mark shows not equal, True

        int soso = 32;
        int boso =12;
        int empty = boso;


        soso = boso;
        boso = soso;


        System.out.println(soso);
        System.out.println(boso);
        //_________________________________________________________________________________________________________________-

        String state1 = "California";
        String state2 = "Illinois";
        String state3 = "Florida";
        String state4 = "IlLinois";
        String state5 = "florida";
        boolean ss = !state1.equals(state2);
        System.out.println(ss);
        boolean rr = state2.equalsIgnoreCase(state4);
        System.out.println(rr);
        boolean rq = state3.equals(state5);
        boolean srq = state1.equals(state5);











    }
}
