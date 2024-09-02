public class StringReplace {
    public static String replace(String s, Object target, Object replacement) {
        if (target instanceof Character && replacement instanceof Character){
            return s.replace((char) target, (char) replacement);
        }else if (target instanceof String && replacement instanceof String){
            return s.replace((String) target, (String) replacement);
        }
        return "";
    }


    public static void main(String[] args) {
        System.out.println(replace("javatpoint is a very good website", 'a', 'e'));
        System.out.println(replace("my name is khan my name is java", "is","was"));
        System.out.println(replace("hey i'am java", "I'am","was"));
    }

}
