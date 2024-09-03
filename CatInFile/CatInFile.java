import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CatInFile {
    public static void cat(String[] args) throws IOException {
        if(args.length == 0){
            return;
        }
        // BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter file = new BufferedWriter(new FileWriter(args[0]));
        
        // String line;
        // while ((line = reader.readLine()) != null) {
        //     file.write(line);
        //     file.newLine();
        // }
        // file.close();

         // Utilisation d'un FileOutputStream pour écrire le contenu binaire dans le fichier
        try (InputStream input = System.in;
            OutputStream output = new FileOutputStream(args[0])) {

            byte[] buffer = new byte[1024]; // Buffer de 4 Ko pour la lecture
            int bytesRead;

            // Lire les données en blocs et les écrire dans le fichier
            while ((bytesRead = input.read(buffer)) != -1) {
                output.write(buffer, 0, bytesRead);
            }
        }
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
