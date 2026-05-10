interface Interface1 {
        int code = 100;
        String name = "Aryan";
    }
    interface Interface2 {
        void display();
    }
    interface Interface3 extends Interface1,Interface2 {
        void display(int x, int y);
    }

    class MyClass implements Interface3{
        public void display(){
            System.out.println("Name: "+ name);
            System.out.println("Code = "+ code);
        }

        public void display(int x, int y){
            System.out.println("Sum of two numbers is: "+ x+y);

        }
    }
    class interF {
        public static void main(String [] args){
            MyClass m = new MyClass();
            m.display();
            m.display(4,7);
        }
    }
