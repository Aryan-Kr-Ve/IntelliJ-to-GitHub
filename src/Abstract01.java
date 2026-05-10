abstract class Shape {
    abstract void area();
}
    class Triangle extends Shape {
        int base;
        int height;
        Triangle(int base, int height){
            this.base = base;
            this.height = height;
        }
        void area(){
            System.out.println("Area of a Triangle = " + (base*height) /2);
        }
    }
    class Rectangle extends Shape{
        int height, width;

        Rectangle(int height, int width) {
            this.height = height;
            this.width = width;
        }
        void area(){
            System.out.println("Area of Rectangle = "+ height*width);
        }
    }
    public class Abstract01 {
        public static void main(String [] args) {
            Shape t= new Triangle(50,60);
            Shape r = new Rectangle(44,97);
            t.area();
            r.area();
        }
    }
