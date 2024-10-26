import java.util.ArrayList;
import java.util.Scanner;

public class Decimal_To_Binary {
    public static void main(String[] args) {
        System.out.print("Enter the decimal number: ");
        Scanner sc = new Scanner(System.in);
        int decimal_num = sc.nextInt();
        sc.close();

        ArrayList<Integer> binaryDigits = new ArrayList<>(); // Use ArrayList to store binary digits

        // Calculate binary digits and add to ArrayList
        while (decimal_num != 0) {
            binaryDigits.add(decimal_num % 2);
            decimal_num /= 2;
        }

        // Print the binary digits in reverse order
        for (int j = binaryDigits.size() - 1; j >= 0; j--) {
            System.out.print(binaryDigits.get(j));
        }
    }
}