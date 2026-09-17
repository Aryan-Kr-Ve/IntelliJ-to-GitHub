import java.util.*;
import java.io.*;
import static java.lang.System.*;
class Arraysort {
        public static void main(String [] args)throws IOException {
            BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter a Length of the String array");
            int size=Integer.parseInt(obj.readLine());
            String[] stringArray = new String[size];
            for (int i = 0; i < size; i++) {
                System.out.print("Enter string " + (i + 1) + ": ");
                stringArray[i] = obj.readLine();
            }
            Arrays.sort(stringArray);
            for(int j = 0; j < size-1; j ++){
                System.out.println(stringArray[j]);
            }
        }
    }