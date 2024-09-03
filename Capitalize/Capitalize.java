import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Capitalize {
    public static void capitalize(String[] args) throws IOException {
        if(args.length < 2){
            return;
        }
        String inputFile = args[0];
        String outputFile = args[1];
        StringBuilder text = new StringBuilder();

        File file = new File(inputFile);
        if (!file.exists()) {
            System.out.println("File not found: " + inputFile);
            return;
        }

        // Use a FileInputStream to handle binary content
        try (FileInputStream fis = new FileInputStream(file)) {
            byte[] buffer = new byte[1024]; // Adjust the buffer size as needed
            int bytesRead;

            // Read the file in chunks and write to the standard output
            while ((bytesRead = fis.read(buffer)) != -1) {
                text.append(new String(buffer, 0, bytesRead));
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }

        String[] tab = text.toString().split(" ");
        String content = "";
        for(int i = 0; i < tab.length; i++){
            if(!tab[i].isEmpty()){

                content += tab[i].substring(0, 1).toUpperCase() + tab[i].substring(1).toLowerCase() + " ";
            }
        }

        BufferedWriter output = new BufferedWriter(new FileWriter(outputFile)); 

        output.write(content.trim());
        output.close();
    }

     public static void main(String[] args) throws IOException {
        Capitalize.capitalize(new String[]{"input", "output"});
        String expectedResult = new String(Files.readAllBytes(Paths.get("result")));
        String userOutput = new String(Files.readAllBytes(Paths.get("output")));
        System.out.println(expectedResult.equals(userOutput));
    }

}
