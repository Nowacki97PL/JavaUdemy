package src;

public class third {
    public static void main(String[] args) {
        double myDouble = 20.00d;
        double myDouble2 = 80.00d;
        double myDouble3 = (myDouble + myDouble2) * 100.00d;
        System.out.println(myDouble3);
        double theRemainder = myDouble3 % 40.00d;
        System.out.println("The remainder = " + theRemainder );
    }
}
