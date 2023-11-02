public class challange {

    public static void main(String[] args) {
        int number = 5;
        checkNumber(number);
    }
    public static void checkNumber(int number) {
        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }
}
