public class PredictOp8 {
    /**
     * The main function increments the value of x by 1 using the post-increment operator and then
     * prints the bitwise complement of x along with its updated value.
     */
    public static void main(String[] args) {
        int x = -8;
        //x = x+1;
        x = x++;
        System.out.println("x is now " + ~x); 
        System.out.println("x is now " + x);
    }
}        
