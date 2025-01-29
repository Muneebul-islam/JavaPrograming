import java.util.Scanner;


public class PrintnNumbers{
    public static void main(String[] args){

        System.out.print("enter the number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sc.close();

        int num = 0;
        while(num <= n ){
            System.out.println(num);
            num++;
        }
    }
}