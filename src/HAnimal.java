// Base class (Parent)
    class HAnimal {
        void eat() {
            System.out.println("Animals eat food.");
        }
    } // Child class 1
    class Dog01 extends HAnimal {
        void bark() {
            System.out.println("Dog barks.");
        }
    }
    // Child class 2
    class Cat extends HAnimal {
        void meow() {
            System.out.println("Cat meows.");
        }
    }
    // Child class 3
    class Cow extends HAnimal {
        void moo() {
            System.out.println("Cow moos.");
        }
    }
    class HierarchicalInheritanceExample {
        public static void main(String[] args) {
            Dog01 d = new Dog01();
            d.eat();   // from Animal
            d.bark();  // Dog's own method

            Cat c = new Cat();
            c.eat();   // from Animal
            c.meow();  // Cat's own method

            Cow cow = new Cow();
            cow.eat(); // from Animal
            cow.moo(); // Cow's own method
        }
    }
