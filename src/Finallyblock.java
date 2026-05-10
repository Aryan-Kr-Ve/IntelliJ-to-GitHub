class Finallyblock{
    public static void main(String[] args)
    {
            int a[]= {1,2,3,4,5,6,7,8};
            int i=15;
            try {
                int j=a[i];
            }
            catch (ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Exception Occured");
            }
            finally {
                System.out.println("Finally Block is Working");

            }
        }
    }
