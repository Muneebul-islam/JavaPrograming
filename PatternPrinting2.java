import java.util.Scanner;


public class PatternPrinting2 {
    public static void main(String[] args) {
      // This Java program prompts the user to enter a number, reads the input using a Scanner object,
      // and then prints a pattern of stars based on the input number.
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        sc.close();


        for(int i=0; i<num; i++){
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
