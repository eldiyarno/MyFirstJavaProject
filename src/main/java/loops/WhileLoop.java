package loops;

public class WhileLoop {
    public static void main(String[] args) {
        int i = 1;
        while (i<=10){
            System.out.println(i);
            i++;
        }
        int p =1;
        while (p<=100){
            if (p%2==0){
                System.out.println(p);
            }
            p++;
        }

        int ps =1;
        while (ps<=10){
            System.out.println("Good morning everyone");
            ps++;
        }

        for (int s = 1; s<=10; s++){
            System.out.println("Good morning everyone!");
        }
        int is = 100;
        while (is>=1){
            if (is%2==1){
                System.out.println(is);
            }
            is--;
        }
        for (int sq =100; sq>=1; sq--){
            if (sq%2==1){
                System.out.println(sq);
        }
        }
        int op =1;
        while (op<=31){
            System.out.println(op+" January 2023");
            op++;
        }

    }
}
