public class PatternPrinting4 {
    public static void main(String[] args) {
        for(int i=0; i<9; i++){
            for(int j=(8-i); j>0; j--){
                System.out.print(" ");
            }
            
            for(int k=0; k<(2*i+1); k++){ 
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0; i<8; i++){
            for(int j=(i+1); j>0; j--){
                System.out.print(" ");
            }
            
            for(int k=0; k<(15-2*i); k++){ 
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
