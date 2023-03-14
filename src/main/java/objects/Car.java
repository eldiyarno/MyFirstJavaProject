package objects;

public class Car {
    String model;
    String year;
    String color;
    String price;
    public void drive(){

        System.out.println(model+" is fastest car and it's not so expensive price: "+price);
    }
    public void stop(){
        System.out.println(model+" is stopped");

    }
    public void playMusic(){
        System.out.println(model+" plays music!");
    }
    public static void main(String[] args) {
        Car toyota = new Car();
        toyota.model = "Supra";
        toyota.color = "Yellow";
        toyota.price = "100000$";
        toyota.year = "2023";
        toyota.drive();
        toyota.playMusic();
        toyota.stop();

        Car toyota2 = new Car();
        toyota2.model = "Yaris";
        toyota2.color = "Black";
        toyota2.year = "2007";
        toyota2.price = "5000$";
        toyota2.drive();
        toyota2.playMusic();
        toyota2.stop();


    }

}
