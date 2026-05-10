public class SLIParent
{
    void display() {
        System.out.println("This is Parent class");
    }
}
class Child extends SLIParent {
    void show() {
        System.out.println("This is Child class");
    }
}
class Test {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display(); // from Parent
        obj.show();    // from Child
    }
}
