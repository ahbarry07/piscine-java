public class CleanExtract {
    public static String extract(String s) {
        if(s == "" || s == null){
            return s;
        }
        String[] array = s.split("\\|");
       
        for(int i = 0; i < array.length; i++){
            array[i] = array[i].trim();
        }

        String goodWord;
        goodWord = array[0];

        for(int j = 1; j < array.length; j++){
            if(array[j].startsWith(".") && array[j].endsWith(".")){
                goodWord += " " + array[j].substring(1, array[j].length() - 1).trim().replace(".", "");
            }
        }
        
        return goodWord.trim()+".";
    }

    public static void main(String[] args) {
        System.out.println(extract("The|. quick brown. | what do you ..| .fox .|. Jumps over the lazy dog. ."));
        System.out.println(extract("  | Who am .I  | .love coding,  |  |.  Coding is fun . | ...  "));
    }

}
