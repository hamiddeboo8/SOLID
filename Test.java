
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("Hello Developers!");

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter an integer: ");
            int input = scanner.nextInt();

            int result = input * 2;
            System.out.println("Result: " + result);
        }
    }
}
