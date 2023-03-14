package scanner;

import java.util.Scanner;

public class WeatherCheck {
    public static void main(String[] args) {
        Scanner weather = new Scanner(System.in);
        System.out.println("Enter the temperature");
        int temp = weather.nextInt();
        System.out.println("Is it raining? true/false");
        boolean isRaining = weather.nextBoolean();
        if (temp<0){
            System.out.println("It's freezing outside! Wear a heavy coat,gloves, and a hat");
        } else if (isRaining&&temp>=0 &&temp<=10){
            System.out.println("it's chilly and rainy! Wear a raincoat, boots, and a scarfs");

        } else if (!isRaining&&temp>=0 &&temp<=10){
            System.out.println("it's chilly outside! Wear a raincoat, boots, and a scarfs");

        } else if (isRaining&&temp>=11 &&temp<=20){
            System.out.println("it's cool outside! Wear a jacket, boots, and a scarfs");

        } else if (isRaining&&temp>=20){
            System.out.println("it's warm and rainy! Wear a jacket, boots, and a scarfs");

        }else if (!isRaining&&temp>=20){
            System.out.println("Wear a t-shirt! shorts and comfortable shoes");

        }else {
            System.out.println("Chill out king, focus on yourself ");
        }
    }
}
