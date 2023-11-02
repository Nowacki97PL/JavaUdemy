
public class Methods {
    public static void main(String[] args) {

        calculateScore(true, 800, 10, 300);
        calculateScore(true, 1200, 8, 500);

    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your Final Score was: " + finalScore);
        }
    }
}

