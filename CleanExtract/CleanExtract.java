public class CleanExtract {
    public static String extract(String s) {
        // Split the input string by '|'
        String[] substrings = s.split("\\|");
        StringBuilder result = new StringBuilder();
        
        // Iterate over each substring
        for (String substring : substrings) {
            // Find the first and last occurrence of '.'
            int firstDot = substring.indexOf('.');
            int lastDot = substring.lastIndexOf('.');
            
            if (firstDot != -1 && lastDot != -1 && firstDot != lastDot) {
                // Extract the portion between the first and last '.'
                String cleaned = substring.substring(firstDot + 1, lastDot).trim();
                // Append the cleaned substring to the result
                if (!cleaned.isEmpty()) {
                    if (result.length() > 0) {
                        result.append(" ");
                    }
                    result.append(cleaned);
                }
            }
        }
        
        return result.toString().trim(); // Ensure no leading or trailing spaces
    }

    public static void main(String[] args) {
        System.out.println(extract("The|. quick brown. | what do you ..| .fox .|. Jumps over the lazy dog. ."));
        System.out.println(extract("  | Who am .I  | .love coding,  |  |.  Coding is fun . | ...  "));
    }

}
