import java.io.*;
public class Z01 {
    public static void main(String [] arg)throws IOException
    {
        BufferedReader obj = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Enter Salary in Integer Value");
        double sal = Double.parseDouble(obj.readLine());
        double tax=0;
        if (sal<=0)
        {
            System.out.println("Error Try Another Positive Value ");
        }
        else if (sal>=15000)
        {
            tax=sal*0.1;
        }
        else if (sal>=40000)
        {
            tax=sal*0.2;
        }
        else
        {
            tax=sal*0.3;
        }
        System.out.println("salary = " + sal +"   Tax = "+tax );
    }
}
