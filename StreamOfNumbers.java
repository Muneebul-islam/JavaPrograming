import java.util.Scanner;

public class StreamOfNumbers{
    public static void main(String args[]){

        System.out.print("enter the numbers : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

     
      //  sc.close();

        int sum = 0;
        while(num != -1){
            sum = sum + num;
            num = sc.nextInt();
        }

        sc.close();

        System.out.println("sum is : "+ sum);

    }        
}