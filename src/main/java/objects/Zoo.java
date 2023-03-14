package objects;

public class Zoo {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.type = "bat";
        animal1.isMammal = false;
        animal1.isCarnivore = true;
        animal1.habitat = "Caves";
        animal1.age = "30 years";
        animal1.eat();
        animal1.play();
        animal1.sleep();
        Animal animal2 = new Animal();
        animal2.type = "Kefteme";
        animal2.isMammal = true;
        animal2.isCarnivore =true;
        animal2.habitat = "Appartments";
        animal2.age = "25 years";
        animal2.eat();
        animal2.sleep();
        animal2.play();


    }
}
