public class Person {
    String name;
    int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method
    public void introduce() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }

   
} // public static void main(String[] args) {
    //     // Creating an object
    //     Person person1 = new Person("Muneeb", 20);
    //     // Using a method
    //     person1.introduce();
    // }
