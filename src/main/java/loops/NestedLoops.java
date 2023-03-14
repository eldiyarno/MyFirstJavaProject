package loops;

public class NestedLoops {
    public static void main(String[] args) {
        for (int r = 1; r <= 15; r++) {
            for (int c = 1; c <= 15; c++) {
                System.out.print(r * c + "\t\t");
            }
            System.out.println();
        }
        int rows = 5;

        for (int s = 1; s <= rows; s++) {
            for (int k = rows-s; k >= 1; k--) {
                System.out.print(" ");
                for (int j=1; j<=1;j++){
                    System.out.print("* ");
                }
            }
            System.out.println();

        }


    }
}
