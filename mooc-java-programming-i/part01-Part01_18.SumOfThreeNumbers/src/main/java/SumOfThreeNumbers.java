
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int firstNum = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number:");
        int secondNum = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the third number:");
        int thirdNum = Integer.valueOf(scanner.nextLine());

        // Calculate Sum
        System.out.println("The sum of the numbers is " + (firstNum + secondNum + thirdNum));

    }
}
