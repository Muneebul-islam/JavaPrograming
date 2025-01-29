import java.util.Scanner;


public class SwitchCaseExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select an option:\n1. Add\n2. Subtract\n3. Multiply\n4. Divide");
        int choice = scanner.nextInt();

        System.out.println("Enter two numbers:");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double result;

        switch (choice) {
            case 1:
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Cannot divide by zero.");
                }
                break;
            default:
                System.out.println("Invalid option.");
                break;
        }
        scanner.close();
    }

    }

