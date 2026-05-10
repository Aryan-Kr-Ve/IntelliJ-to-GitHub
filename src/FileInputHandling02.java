import java.io.*;

        public class FileInputHandling02 {
            public static void main(String [] args) {
                BufferedReader reader = null;

                try {
                    reader = new BufferedReader(new FileReader("C:\\Users\\RAKESH\\Downloads\\NFS.txt"));
                    String line;
                    while ((line = reader.readLine()) != null){
                        System.out.println(line);
                    }
                }catch (IOException e) {
                    System.out.println("Error reading: "+ e.getMessage());
                }
                finally {
                    try {
                        if(reader != null){
                            reader.close();
                        }
                    }catch (IOException e){
                        System.out.println("Error reading: "+ e.getMessage());
                    }
                }
            }
        }