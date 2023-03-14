package arithmaticOperators;

public class HomeWorkArithmeticOp2 {
    public static void main(String[] args) {
        int a = 100;
        int b = 200;
        int ab = a + b;
        System.out.println(a+" + "+b+ " = "+ab);

        int q = 5;
        int w = 9;
        int e = 10;
        int qwe = q+w+e;
        System.out.println(q+" + "+w+" + "+e+" = "+qwe);
        //_____________________________________________________________
        int d = 1;
        int r = 3;
        int s = 2;
        int t = 4;
        int p = 10;
        System.out.println(d+" + "+2+" = "+(d+2));
        System.out.println(r+" - "+1+" = "+(r-1));
        System.out.println(s+" * "+2+" = "+(s*2));
        System.out.println(t+" / "+2+" = "+(t/2));
        System.out.println(s+" + "+8+" = "+(s+8));
        System.out.println(p+" % " + 7 + " = "+(p%7));
        //______________________________________________________________________

        int length = 9;
        int width = 15;
        int area = length*width;
        int perimeter = 2*(length+width);
        System.out.println(area);
        System.out.println(perimeter);
        //________________________________________________________________

        int gde = 2345;
        int sys = (gde+8)/3%5*5;
        System.out.println(sys);
        //___________________________________________________________
        int gdes = 2345;
        gdes = gdes+=8;
        System.out.println(gdes);
        gdes = gdes/=3;
        System.out.println(gdes);
        gdes = gdes%=5;
        System.out.println(gdes);
        gdes = gdes*=5;
        System.out.println(gdes);

        //___________________________________________________________
        int se = 23;
        int sq = 45;
        System.out.println(se==sq);
        int sw = -10;
        int ss = 10;
        System.out.println(sw==ss);







    }
}
