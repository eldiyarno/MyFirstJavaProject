package loops;

public class dsadsa {
    public static void main(String[] args) {
        for (int i = 0; i<3; i++){
            for (int j = 0; j<3; j++)
                System.out.println(i+""+j);
            System.out.println();
        }
        for (int k = 1; k<=6; k++){
            for (int t =6; t>=k; t--)
                System.out.print("#");
            System.out.println();
        }
        int q = 0;
        for (int s =1; s<=6; s++){
            for (int w = 1; w<=s; w++)
                System.out.print(s);
            System.out.println();
        }
    }
}
