package objects;

public class School {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Leo";
        student1.phone = "123456";
        student1.email = "Leo@Gmail.com";
        student1.age = 18;
        student1.major = "Law";
        Student student2 = new Student();
        student2.name = "Kefteme";
        student2.phone = "123465";
        student2.email = "Kefteme@gmail.com";
        student2.age = 32;
        student2.major = "Barhotnye tyagi";
        student1.read();
        student2.read();
        student2.sleep();
        student2.printInfo();
    }
}
