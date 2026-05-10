public class Excep01 {
    public static void main(String [] args) {
        int a=20;
        int b=0;
        int c;

        try {
// code to input a and b
            c=a/b;
            System.out.println("a/b="+c);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
