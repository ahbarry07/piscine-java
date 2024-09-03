import java.io.*;

public class Cat {
    public static void cat(String[] args) throws IOException {
        // Check if a file path is provided
        if (args.length < 1) {
            return;
        }

        String filePath = args[0];
        File file = new File(filePath);

        // Check if the file exists
        if (!file.exists()) {
            System.out.println("File not found: " + filePath);
            return;
        }

        // Use a FileInputStream to handle binary content
        try (FileInputStream fis = new FileInputStream(file)) {
            byte[] buffer = new byte[4096]; // Adjust the buffer size as needed
            int bytesRead;

            // Read the file in chunks and write to the standard output
            while ((bytesRead = fis.read(buffer)) != -1) {
                System.out.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }


    public static void main(String[] args) throws IOException {
        PrintStream stdout = System.out;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        Cat.cat(new String[]{"input.txt"});
        String output = outputStream.toString();
        // Reset out to stdout
        System.setOut(stdout);
        System.out.println(output.equals("test input file\n"));

        ByteArrayOutputStream outputStream2 = new ByteArrayOutputStream();
        PrintStream printStream2 = new PrintStream(outputStream2);
        System.setOut(printStream2);

        Cat.cat(new String[]{});
        String output2 = outputStream2.toString();
        // Reset out to stdout
        System.setOut(stdout);
        System.out.println(output2.equals(""));
    }

}
