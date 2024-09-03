import java.io.*;
// import java.nio.file.Files;

public class FileSearch {
    public static String searchFile(String fileName) {
        File directory = new File("documents");
        return findFile(fileName, directory);
    }

    private static String findFile(String name, File directory){
        
        File[] lists = directory.listFiles();

        if (lists != null) {
            for (File file : lists) {
                if (file.isDirectory()) {
                    
                    String result = findFile(name, file);
                    if (result != null) {
                        return result;
                    }
                } else if (name.equalsIgnoreCase(file.getName())) {
                    return file.getPath();
                }
            }
        }
        return null;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(searchFile("file.txt"));
    }

}
