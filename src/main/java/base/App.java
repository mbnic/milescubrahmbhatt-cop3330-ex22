package base;
import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        int a = myApp.getValue("first");
        int b = myApp.getValue("second");
        int c = myApp.getValue("third");

        myApp.checkAllDifferent(a, b, c);
        myApp.findLargest(a, b, c);
    }

    public void findLargest(int a, int b, int c) {
        if (a > b && a > c)
            System.out.printf("%d is the largest number.", a);

        else if (b > a && b > c)
            System.out.printf("%d is the largest number.", b);

        else
            System.out.printf("%d is the largest number.", c);
    }

    public void checkAllDifferent(int a, int b, int c) {
        if (a == b || a == c || c == b) {
            System.out.print("yikes, same numbers");
            System.exit(0);
        }

    }

    public int getValue(String order) {
        System.out.println("Enter the " + order + " number: ");
        return in.nextInt();
    }
}
