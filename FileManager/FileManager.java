import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;

public class FileManager {
    public static void createFile(String fileName, String content) throws IOException {
        
        BufferedWriter file = new BufferedWriter(new FileWriter(fileName));
        file.write(content);
        file.close();
    }
    
    public static String getContentFile(String fileName) throws IOException {
        File file = new File(fileName);
        if(!file.exists()){
            return "File not found";
        }
        StringBuilder text = new StringBuilder();
        try(FileInputStream fis = new FileInputStream(file)){
            byte[] buffer = new byte [4096];
            int byteRead;
            while ((byteRead = fis.read(buffer)) != -1) {
                text.append(new String(buffer, 0, byteRead));
            }
        }catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
        System.out.println("test "+ text.toString());
        return text.toString().trim() + "\n";
    }
    
    public static void deleteFile(String fileName) {
        File file = new File(fileName);
        if(!file.exists()){
            return;
        }

        file.delete();
    }

    public static void main(String[] args) throws IOException {
        FileManager.createFile("file.txt", "Lorem ipsum");
        System.out.println(FileManager.getContentFile("file.txt"));
        FileManager.deleteFile("file.txt");
    }

}
