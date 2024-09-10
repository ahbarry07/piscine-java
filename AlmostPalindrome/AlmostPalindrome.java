public class AlmostPalindrome {
    public static boolean isAlmostPalindrome(String s) {
        StringBuilder newS = new StringBuilder(s).reverse();
        s = s.toLowerCase();
    //   for(int i=0; i<s.length(); i++){
    //       newS = s.charAt(i) + newS;
    //   }
      int count = 0;
      System.out.println("new "+ newS);
      System.out.println("cha "+ s);

      for(int i =0; i< s.length(); i++){
         if(newS.charAt(i) != s.charAt(i)){
           count++;
         }
      } 
        return count==2;
    }
  
   public static void main(String[] args) {
        System.out.println(isAlmostPalindrome("matmam"));
        System.out.println(isAlmostPalindrome("level"));
    }
}