import java.util.Scanner;

public class SumOf_n_Numbers{
    public static void main(String args[]){

        System.out.print("enter the number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

       // `sc.close();` is closing the Scanner object `sc`. This is important to release system
       // resources associated with the Scanner object and prevent any resource leaks. It is a good
       // practice to close resources like Scanner after their use to free up memory and avoid
       // potential issues.
        sc.close();
        
        int sum =0, num=1;
        while(num <=n){
            sum = sum + num;
            num++;
        }
        System.out.println("sum of  "+ n + " numbers is : "+ sum);
    }
}