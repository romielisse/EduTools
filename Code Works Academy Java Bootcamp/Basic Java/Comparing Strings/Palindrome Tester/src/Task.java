class Task {
  public static void main(String[] args) {

  }

  // Complete the method below so that it returns true if
  // string passed in is a palindrome and false if not
  //
  // Palindromes are strings that read the same forwards
  // and backwards
  public static Boolean isPalindrome(String s){
    // Convert to lower case to simplify comparing strings
    String phrase = s.toLowerCase();
    String backwards = "";

      // loop through the string backwards, starting with the last character
      for(int i = phrase.length() - 1; i >= 0; i--) {
        // Extract each letter as the next character
        // and build the backwards string
        String letter = phrase.substring(i, i + 1);
        backwards += letter;
      }


      if(phrase.equals(backwards)) {
        return true;
      }

      return false;
  }
}