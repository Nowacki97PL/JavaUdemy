

public class third {
    public static void main(String[] args) {
        double myDouble = 20.00d;
        double myDouble2 = 80.00d;
        double myDouble3 = (myDouble + myDouble2) * 100.00d;
        System.out.println(myDouble3);
        double theRemainder = myDouble3 % 40.00d;
        System.out.println("The remainder = " + theRemainder );
        calculateScore();
    }

    public static void calculateScore() {
        boolean gameOver = true;
        int score = 4000;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your Final Score was: " + finalScore);
        }
    }
}

