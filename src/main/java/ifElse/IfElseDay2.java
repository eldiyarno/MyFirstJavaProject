package ifElse;

public class IfElseDay2 {
    public static void main(String[] args) {
        /*
        if (boolean){
        write some code
        }
        else if(boolean){
        write some code
        }else{
        write else code
        }
         */
        int day = 3;
        if (day==7){
            System.out.println("Monday");

        } else if(day==2){
            System.out.println("Tuesday");

        }else {
            System.out.println("Wednesday");
        }

        String day4 = "Thursday";
        if (day4 == "Monday"){
            System.out.println("1");
        }else if (day4=="Tuesday"){
            System.out.println("2");
        }else if (day4 == "Wednesday"){
            System.out.println("3");
        } else if (day4=="Thursday") {
            System.out.println("4");

        } else if(day4=="Friday"){
            System.out.println("5");
        } else if(day4=="Saturday"){
            System.out.println("6");
        }else {
            System.out.println("Sunday");
        }

        byte time = 18;
        if (time>=9&&time<=17) {
            System.out.println("Work Hours");
        } else if (time>=7&&time <=9 ||time>=18&&time<=18) {
            System.out.println("Work Hours");
        } else if (time>=6&&time<=8) {
            System.out.println("Breakfast time");
        } else if (time >=12&&time<=13) {
            System.out.println("Lunch time");
        } else if (time>=20&&time<=22) {
            System.out.println("Diner time");
        } else if (time>=22&time<=24) {
            System.out.println("Late hours");
        } else if (time>=0&&time<=6) {
            System.out.println("Sleep hours");
        }else{
            System.out.println("invalid");
        }

    }
}
