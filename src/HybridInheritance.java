class HybridInheritance{
        void eat() {
            System.out.println("Animal eats food.");
        }
    }
    // Interface
    interface Pet {
        void play();

        // Derived class from Animal and implements Pet interface
        class Fish extends HybridInheritance implements Pet {
            void bark() {
                System.out.println("Dog barks.");
            }
            public void play() { // interface method implementation
                System.out.println("Dog plays.");
            }
        }
        // Another derived class
        class Shark extends HybridInheritance implements Pet {
            void meow() {
                System.out.println("Cat meows.");
            }
            public void play() {
                System.out.println("Cat plays.");
            }
        }
        class HybridInheritanceExample {
            public static void main(String[] args) {
                Fish obj01 = new Fish();
                obj01.eat();  // from Animal
                obj01.bark(); // own method
                obj01.play(); // from Pet interface
                Shark obj = new Shark();
                obj.eat();  // from Animal
                obj.meow(); // own method
                obj.play(); // from Pet interface
            }
        }
    }
    /*Hybrid inheritance is a combination of two or more types of inheritance (e.g., single, multiple, multilevel, hierarchical).
Java doesn’t support multiple inheritance with classes directly (to avoid the diamond problem).
But we can achieve hybrid inheritance using interfaces along with classes.*/
