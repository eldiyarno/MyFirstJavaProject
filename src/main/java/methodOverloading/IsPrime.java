package methodOverloading;

public class IsPrime {
    boolean isPrime;

    public boolean prime(int a) {
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                return false;

            }


        }return true;

    }

    public boolean prime(short a) {
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                return false;

            }


        }return true;

    }

    public boolean prime(long a) {
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                return false;

            }


        }return true;

    }
}


