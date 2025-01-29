public class Person1 {
    float height;
    int age;

    Person1(){}

    public Person1(Person1 p1, Person1 p2){
        if(p1.height == p2.height && p1.age == p2.age){
            System.out.println("persons are equal");
        }
        else
        System.out.println("not equal");
    }
}
