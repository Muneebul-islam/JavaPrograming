/**
 * The ArrayPattern1 class initializes and fills a jagged array with numbers in a specific pattern.
 */
public class ArrayPattern1 {
    public static void main(String[] args) {
        // Defining the array to store numbers
        int[][] arr = new int[4][];
        
        // Initializing the jagged array (each row has different length)
       // This part of the code is initializing a jagged array `arr` with different lengths for each
       // row.
        arr[0] = new int[1];  // Row 0 has 1 element
        arr[1] = new int[2];  // Row 1 has 2 elements
        arr[2] = new int[3];  // Row 2 has 3 elements
        arr[3] = new int[4];  // Row 3 has 4 elements

        // Variable to store the number to be printed
        int number = 0;

        // Filling the array and printing the pattern
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = number;  // Assigning number to the array element
                System.out.print(arr[i][j]);  // Printing the element
                number++;  // Incrementing the number
            }
            System.out.println();  // Moving to the next line after each row
        }
    }
}

        
     
    

