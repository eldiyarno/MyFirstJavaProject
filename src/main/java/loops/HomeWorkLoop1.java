package loops;

public class HomeWorkLoop1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            if (i % 5 == 0) {
                System.out.println(i + " ");
            }
        }
        //2
        for (int k = 2; k <= 20; k++) {
            if (k % 2 == 0) {
                System.out.println(k);
            }
        }
        //3
        for (int s = 10; s >= 1; s--) {
            System.out.println(s);
        }
        //4
        int n = 5;
        for (int s = 1; s<=10; s++){
            System.out.println(n*s);



        }
        //5
        for (int g = 1; g <= 20; g++) {
            if (g % 2 == 1) {
                System.out.println(g);
            }
        }
        //6
        int sum = 0;
        for (int q = 2; q<=50; q=q+2){
            if (q%2==0);{
                System.out.println(q);
                sum=sum+q;
            }

            System.out.println(sum);
        }
        //7
        int qwe = 1234;
        int s = 0;
        for (int i = qwe; i>0;i=i/10){
            s+=i%10;
        }
        System.out.println(qwe+" = "+s);

        int rows = 6;

        for (int a = 1; a <= rows; a++) {
            for (int k = rows - a; k >= 1; k--) {
                System.out.print(" ");
                for (int j = 1; j <= 1; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        //9
        int rowss = 4;

        for (int i = 1; i<=rowss; i++){
            System.out.println();
            for (int j = 1; j<=i; j++){
                System.out.print(i);
            }
        }
        System.out.println();

    }
    }

