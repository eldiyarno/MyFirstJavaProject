package strings;

import java.util.Locale;

public class HomeWorkString3 {
    public static void main(String[] args) {
        String rold = "Hello world";
        System.out.println(rold.indexOf('w'));
        //2
        System.out.println(rold.charAt(0));
        //3
        String gold = "HELLO";
        gold = gold.toLowerCase();
        System.out.println(gold);
        //4
        gold = gold.toUpperCase();
        System.out.println(gold);
        //5
        String eq = "hello";
        String eq2 = "Hello";
        System.out.println(eq.equals(eq2));
        //6
        String ro = "the quick brown fox";
        String First = ro.substring(0, 1).toUpperCase();
        System.out.println(First);// didn't understand
        //7
        String str = "Hello";// didn't understand
        //8 didn't understand
        //9
        String rrs = "Hello";
        String dds = "World";
        System.out.println(rrs+" "+dds);
        //10
        String pp = "Hello";
        String pe = "hello";
        System.out.println(pp.equalsIgnoreCase(pe));
        //11
        String kk = "Hello World";
        System.out.println(kk.length());
        //12
        char ssq = kk.charAt(3);
        System.out.println(ssq);
        //13
        int os = kk.indexOf('l');
        System.out.println(os);
        //14
        String op = "hello";
        String op2 = "hello";
        System.out.println(op==op2);
        System.out.println(op.equals(op2));
        //15
        String ops = "HELLO";
        String ops2 = "hello";
        System.out.println(ops==ops2);
        System.out.println(ops.equals(ops2));
        //16
        String golda = "HELLO WORLD";
        golda = golda.toLowerCase();
        System.out.println(golda);
        //17
        String goldas = "hello world";
        goldas = goldas.toUpperCase();
        System.out.println(goldas);
        //18'
        String reqrq= "Hello World";
        reqrq = reqrq.replace("l","r");
        System.out.println(reqrq);
        //19




        }
    }
