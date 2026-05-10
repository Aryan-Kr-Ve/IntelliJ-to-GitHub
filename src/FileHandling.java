import java.io.*;
class FileHandling {
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            // Take input file name from user
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter the file name (with extension): ");
            String fileName = input.readLine();

            // Open the file
            br = new BufferedReader(new FileReader(fileName));
            String line;

            System.out.println("\n--- File Content ---");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found. Please check the name and try again.");
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } finally {
            try {
                if (br != null) br.close();
            } catch (IOException e) {
                System.out.println("Error closing file.");
            }
        }
    }
}
