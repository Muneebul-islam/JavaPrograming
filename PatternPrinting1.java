import java.util.Scanner;


public class PatternPrinting1{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        sc.close();

        for(int i=0; i<num; i++){
            for(int j=0; j<num; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}