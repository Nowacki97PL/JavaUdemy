package src;

public class SecondClass {
    public static void main(String[] args) {
        System.out.println("Elo");

        boolean isAlien = false;
        if (!isAlien) {
            System.out.println("It is not an alien!");
            System.out.println("I'm scared aliens");
        }

        int topScore = 10;
        if (topScore > 100){
            System.out.println("You got the high score!");
        }

        int newValue = 50;
        if (newValue == 50){
            System.out.println("This is True");
        }

        boolean isCar = false;
        if (!isCar){
            System.out.println("This is not true");
        }
        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? true : false;
        if (isDomestic){
            System.out.println("This car is domestic to our contry");
        }
    }
}
