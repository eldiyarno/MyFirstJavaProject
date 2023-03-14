package strings;

public class StringReplace {
    public static void main(String[] args) {
        String word = "Apple banana strawberry";
        word = word.replace('a','e');
        System.out.println(word);
        System.out.println(word.replace('e','a'));

        String countries = "Italia Columbia Croatia ";
        System.out.println(countries.replace(" "," republic. "));

        String foods = "hot lentil soup, hot plov, cold kompot, cold ice-cream, warm pasta, warm pizza";
        foods = foods.replace("hot","tasty");
        foods = foods.replace("cold","cool");
        foods = foods.replace("warm","italian");
        System.out.println(foods);


        String letters = "dasds dfdfd sadsadas fdfd fdfddfdfaaaacoxz";
        letters = letters.replace('f', 'a');
        System.out.println(letters);
        letters = letters.replace('b', 'a');
        letters = letters.replace('d','a');
        letters = letters.replace('s', 'a');
        letters = letters.replace('c','a');

        String letters2 = "hello everyone, hope you are doing good, i wish you good luck";
        letters2 = letters2.replace('h','a');
        letters2 = letters2.replace('e','a');
        letters2 = letters2.replace('l','a');
        letters2 = letters2.replace('o','a');
        letters2 = letters2.replace('v','a');
        letters2 = letters2.replace('r','a');
        letters2 = letters2.replace('y','a');
        letters2 = letters2.replace('i','a');
        letters2 = letters2.replace('w','a');
        letters2 = letters2.replace('g','a');
        letters2 = letters2.replace('c','a');
        letters2 = letters2.replace('k','a');
        letters2 = letters2.replace('d','a');
        letters2 = letters2.replace('s', 'a');
        letters2 = letters2.replace('u','a');
        System.out.println(letters2);




    }
}
