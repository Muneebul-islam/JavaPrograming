public class operator_1{/**
 * The function decrements the value of 'a' until it is greater than the
 * post-incremented value of 'b', printing "hello" each time.
 * 
 * @param args In the given code snippet, the `main` method takes an array of
 * `String` arguments named `args`. However, in the provided code, the `args`
 * array is not being used. If you want to pass any command-line arguments when
 * running this program, you can provide them as space
 */

    public static void main(String args[]){
        int a = 20;
        int b = 11;
        while( --a > b++){
            System.out.println("hello");
        }
    }
}