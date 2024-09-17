import java.io.IOException;

public class RegexMatch {
    public static boolean containsOnlyAlpha(String s) {
        return s.matches("^[a-zA-Z]+$");
    }
    
    public static boolean startWithLetterAndEndWithNumber(String s) {
        return s.matches("^[a-zA-Z].*[0-9]$");
    }
    
    public static boolean containsAtLeast3SuccessiveA(String s) {
        return s.matches(".*A{3,}.*");
    }

    public static void main(String[] args) throws IOException {
        System.out.println(containsOnlyAlpha("azejkdfhjsdf"));
        System.out.println(containsOnlyAlpha("azejkd fhjsdf"));
        System.out.println(startWithLetterAndEndWithNumber("asjd jd34jds jkfd6f5"));
        System.out.println(startWithLetterAndEndWithNumber("asjd jd34jds jkfd6."));
        System.out.println(containsAtLeast3SuccessiveA("sdjkAAAAAsdjksj"));
        System.out.println(containsAtLeast3SuccessiveA("sdjkAAsdaaasdjksj"));
    }
}