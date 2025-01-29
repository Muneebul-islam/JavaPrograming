class Shape {
    public void area(){
        System.out.println("displays area");
    }
    
}

class Triangle extends Shape{
    public void area(int l, int h){
        System.out.println(l*h/2);
    }
}
class EquilateralTriangle extends Triangle{
    public void area(int l, int h){
        System.out.println(l*h/2);
    }
}

public class OOPS {
  public static void main(String[] args) {
    Triangle t1 = new Triangle();
   t1.area(4,4);

  }  
}
