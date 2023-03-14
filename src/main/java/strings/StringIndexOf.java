package strings;

public class StringIndexOf {
    public static void main(String[] args) {
        String ad = "Buy two, get one for free!";
        int index = ad.indexOf('g');
        System.out.println(index);//9
        int intes = ad.indexOf('t');
        System.out.println(intes);
        index = ad.indexOf('o',7);
        index = ad.indexOf('o',ad.indexOf('o')+1);
        System.out.println(index);

        String pres = "TRUMP r BYE";
        System.out.println(pres.indexOf('r',2));

    }
}
