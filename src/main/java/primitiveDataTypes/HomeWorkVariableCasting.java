package primitiveDataTypes;

public class HomeWorkVariableCasting {
    public static void main (String [] args) {
        byte any1 = 22;
        short an2 = 33;
        int an3 = 4444;
        long an4 = 444444;
        float an5 = 3.11f;
        double an6 = 222.4444444444;

        any1 = (byte) an2;
        any1 = (byte) an3;
        any1 = (byte) an4;
        any1 = (byte) an5;
        any1 = (byte) an6;
        //_________________
        an2 = any1;
        an2 = (short) an3;
        an2 = (short) an4;
        an2 = (short) an5;
        an2 = (short) an6;
        //__________________
        an3 = any1;
        an3 = an2;
        an3 = (int) an4;
        an3 = (int) an5;
        an3 = (int) an6;
        //________________________
        an4 = any1;
        an4 = an2;
        an4 = an3;
        an4 = (long) an5;
        an4 = (long) an6;
        //__________

        an5 = any1;
        an5 = an2;
        an5 = an3;
        an5 = an4;
        an5 = (float) an6;
        //______________________________________________
        an6 = any1;
        an6 = an2;
        an6 = an3;
        an6 = an4;
        an6 = an5;




    }


}
