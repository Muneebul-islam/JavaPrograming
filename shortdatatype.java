public class shortdatatype {
  // This Java program defines a class `shortdatatype` with a `main` method. Inside the `main` method:
  // 1. It declares a variable `x` of type `short` and assigns it the value 132.
  // 2. It then declares a variable `y` of type `short` and assigns it the bitwise complement of `x`
  // using the `~` operator. The `(short)` before `~x` is a type cast to ensure the result is stored as
  // a `short`.
  // 3. Finally, it prints the value of `y` to the console using `System.out.println(y)`.
    public static void main(String[] args) {
        short x = 132;
        short y = (short)~x;
        System.out.println(y);
    }
}
