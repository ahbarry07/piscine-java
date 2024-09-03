import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CatInFile {
    public static void cat(String[] args) throws IOException {
        if(args.length == 0){
            return;
        }
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter file = new BufferedWriter(new FileWriter(args[0]));
        
        String line;
        while ((line = reader.readLine()) != null) {
            file.write(line);
            file.newLine();
        }
        file.close();
    }


    public static void main(String[] args) throws IOException {
        String input = "input file test\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        CatInFile.cat(new String[]{"output"});
        String fileContent = new String(Files.readAllBytes(Paths.get("output")));
        System.out.println(fileContent.equals(input));
    }

}
