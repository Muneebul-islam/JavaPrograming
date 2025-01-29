 import java.util.ArrayList;
 
 
 class ArrayLisAssignment{
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();

       
        for(int i=0; i<11; i++){
            list1.add(i);
        }

        
        for(int i=0; i<11; i++){
            System.out.println(list1.get(i));
        }

        list1.remove(1);
        list1.remove(5);
        list1.remove(6);
        
        for(int i=0; i<11; i++){
            System.out.println(list1.get(i));
        }


    }
 }