package loops;

public class DoWhileLoop {
    public static void main(String[] args) {
        int i = 2;
        do {
            System.out.println(i);
            i++;
        }while (i<=10);

        int p = 1;
        do {
            if (p%2==1)
            System.out.println(p);
            p++;
        }while (p<=100);


    }
}
