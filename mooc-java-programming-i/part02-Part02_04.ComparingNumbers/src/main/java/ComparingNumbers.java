
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter two numbers below...");
        int firstNum = Integer.valueOf(scanner.nextLine());
        int secondNum = Integer.valueOf(scanner.nextLine());

        // Conditional
        if (firstNum > secondNum) {
            System.out.println(firstNum + " is greater than " + secondNum);
        } else if (firstNum < secondNum) {
            System.out.println(firstNum + " is smaller than " + secondNum);
        } else {
            System.out.println(firstNum + " is equal to " + secondNum);
        }

    }
}