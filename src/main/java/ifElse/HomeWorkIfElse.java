package ifElse;

public class HomeWorkIfElse {
    public static void main(String[] args) {
        int number = 40;
        if (number > 0) {
            System.out.println(number + " is positive.");
        } else if (number < 0) {
            System.out.println(number + " is negative.");
        } else {
            System.out.println(number + " is zero.");
        }
//2
        int year = 2019;
        if (year % 4==0&&year %100 !=0||year % 400==0){
            System.out.println(" is a leap year");
        }else{
            System.out.println("is not a leap year");
        }
        //3
        int num1 = 3;
        int num2 = 123;
        if (num1>num2){
            System.out.println("Num1 larger than num2");
        }else if (num1<num2){
            System.out.println("Num2 larger than num1");
        }else {
            System.out.println("Equal");
        }
        //4
        double tempInFahrenheit = 77.3;
        if (tempInFahrenheit<=32){
            System.out.println("the temperature is below freezing");
        } else if (tempInFahrenheit<=212) {
            System.out.println("in between");
            
        } else if (tempInFahrenheit>=212) {
            System.out.println("Boiling");
        }
        byte month = 6;
        if (month == 11||month == 1||month == 2){
            System.out.println("Winter");
        } else if (month == 3||month == 4|| month == 5) {
            System.out.println("Spring");
        } else if (month == 6||month == 7||month == 8) {
            System.out.println("Summer");
        } else if (month == 9||month == 10|| month == 11) {

        }else {
            System.out.println("Please enter valid season");
        }
    }
}
