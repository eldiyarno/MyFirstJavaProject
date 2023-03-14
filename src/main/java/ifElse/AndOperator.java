package ifElse;

public class AndOperator {
    public static void main(String[] args) {



        if (2<3&&5<10){
            System.out.println("bye bye");
        }
        if (true && true){
            System.out.println("potato");

        }
        String username = "sunshine123676575";
        String password = "moonlight456!true";
        String email = "sunshine123@gmail.com";
        String actualusername = "sunshine123676575";
        String actualpassword = "moonlight456!true";
        String acutalemail = "sunshine123@gmail.com";

        if (!username.equals(actualusername)&&password.equals(actualpassword)){
            System.out.println("username");

        }


    }
}
