package loops;

public class Continue {
    public static void main(String[] args) {
        for (int i = 1; i<=10; i++){
            if (i==5){
                continue;
            }
            System.out.println(i);
        }

        for (int k = 1; k<=100; k++){
            if (k%2==0){
                continue;


            }
            System.out.println(k);
        }
        for (int o = 1; o<=100; o++){
            if (o%3==0){
                continue;
            }
            System.out.println(o);
        }
    }
}
