package objects;



public class TheWaterTracker {
    int totalAmount;
int intake;

    public void addWater(int amount) {
        totalAmount = totalAmount + amount;

    }

    public int getWaterIntake() {
        intake = 3300;

        return intake;
    }

    public String getStatus() {
        if (totalAmount == 2000) {
            return "You are hydrated!";
        } else if (totalAmount > 2000) {

        } return "You need to drink more water.";
    }

    public static void main(String[] args) {
        TheWaterTracker user = new TheWaterTracker();
        user.addWater(2000);
        user.getStatus();

        System.out.println(user.totalAmount);
        System.out.println(user.getStatus());
        System.out.println(user.getWaterIntake());
    }
}

