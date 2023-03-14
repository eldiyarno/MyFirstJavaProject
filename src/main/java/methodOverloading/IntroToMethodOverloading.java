package methodOverloading;

public class IntroToMethodOverloading {
    /*
    method names must be unique. We cannot have two or more methods to use the same name
     */
    public int getAreaOfRectangle(int length, int width){
        return length * width;
    }
    public int getAreaOfRectangle(long length, int width){
        return (int)length * width;

    }
    public int getAreaOfRectangle(double length, double width){
        System.out.println(9.4+"fbd");
        return (int)(length * width);
    }
    public int getPerimeterOfSquare (int a){
        return a * 4;
    }public int getPerimeterOfSquare (long a) {
        return (int) (a * 4);
    }public int getPerimeterOfSquare (double a) {
    return (int) (a * 4);
}
}
