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
        goodWord = array[0].replace(".", "");

        for(int j = 1; j < array.length; j++){
            if((array[j].startsWith(".") && array[j].endsWith(".") || array[j].startsWith("."))){
                goodWord += " " + array[j].substring(1, array[j].length()).trim().replace(".", "").trim();
            }else if(!array[j].startsWith(".") && !array[j].endsWith(".")){
                for (String str : array[j].split("\\s")) {
                    if (str.startsWith(".")){
                        // System.out.println("enter");
                        goodWord += " " + str.substring(1, str.length());
                    }
                }
            }
            if(j == array.length -1 && array[j].endsWith(".")){
                goodWord += ".";
            }
        }
        
        return goodWord.trim();
    }

    public static void main(String[] args) {
        System.out.println(extract(".The|. quick brown. | what do you ..| .fox .|. Jumps over the lazy dog. ."));
        System.out.println(extract("  | Who am .I  | .love coding,  |  |.  Coding is fun . | ...  "));
    }

}
