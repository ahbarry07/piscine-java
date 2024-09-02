public class Palindrome {
    public static boolean isPalindrome(String s) {
        String reverse = "";
        for(int i = 0; i < s.length(); i++){
            reverse = s.charAt(i) + reverse;
        }

        return s.toLowerCase().contentEquals(reverse.toLowerCase());
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("ressasser"));
        System.out.println(isPalindrome("Bonjour"));
    }

}
