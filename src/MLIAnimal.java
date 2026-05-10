// Base class (Grandparent)
class MLIAnimal {
    void eat() {
        System.out.println("Animals eat food.");
    }
}
// Derived class (Parent)
class Mammal extends MLIAnimal {
    void breathe() {
        System.out.println("Mammals breathe air.");
    }
}
// Derived class (Child)
class Dog extends Mammal {
    void bark() {
        System.out.println("Dog barks.");
    }
}
class MultilevelInheritanceExample {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();     // from MLIAnimal
        d.breathe(); // from Mammal
        d.bark();    // from Dog
    }
}
