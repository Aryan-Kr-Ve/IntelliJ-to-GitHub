import java.io.*;
public class Z02 {
    public static void main(String[] arg) throws IOException {
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("How many numbers do you want to enter? ");
        int count = Integer.parseInt(obj.readLine());

        String numarr [] = new String[count];

        System.out.println("Enter " + count + " numbers:");
        for (int i = 0; i < count; i++) {
            numarr[i] = obj.readLine();
        }
        int sum = 0;
        for (int j = 0; j < numarr.length; j++) {
            sum = sum + Integer.parseInt(numarr[j]);
        }
        System.out.println("Sum of all numbers: " + sum);
    }
}