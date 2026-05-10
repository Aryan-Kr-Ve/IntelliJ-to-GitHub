public class Excep02 {// user defined Exception
        static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        }
        else { System.out.println("Access granted - You are old enough!"); }
    }
    public static void main(String [] args)
    {
        Excep02 obj=new Excep02();
        obj.checkAge(29);

    }
}
