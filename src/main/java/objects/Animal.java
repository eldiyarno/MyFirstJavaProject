package objects;

public class Animal {
    String type;
    boolean isMammal;
    boolean isCarnivore;
    String age;
    String habitat;

    public void eat(){
        System.out.println(type+" eats the rats and they are mammal animals: "+isMammal+" and they are carnivore: "+isCarnivore);
    }
    public void sleep(){
        System.out.println(type+" sleeps usually in daytime and lives in the "+habitat);
    }
    public void play(){
        System.out.println(type+" not plays barhotnye tyagi");
    }
}
