class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void eat() {
        System.out.println("Dog is eating"); 
    }

    void showParentEat() {
        super.eat(); // Calls the Animal class's eat() method
    }
}
