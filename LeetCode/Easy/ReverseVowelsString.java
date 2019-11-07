/**
 * https://leetcode.com/problems/reverse-vowels-of-a-string/
 * Reverse the vowels on a String
 * @Author EnMedina
 */
class Solution {
  public String reverseVowels(String s) {
      StringBuilder sbVowelReverse = new StringBuilder();
      sbVowelReverse.append(s); 
      HashSet<Character> vowels = new HashSet<>();
      for( char c : "aeiouAIEOU".toCharArray()) vowels.add(c);
      int startIndex = 0;
      int endIndex = s.length()-1;
      while( startIndex < endIndex) {
        while(startIndex < s.length() && !vowels.contains(sbVowelReverse.charAt(startIndex))) startIndex++;
        while(endIndex >= 0 && !vowels.contains(sbVowelReverse.charAt(endIndex))) endIndex--;
        if(startIndex < endIndex ) {
          char tempChar = sbVowelReverse.charAt(startIndex);
          sbVowelReverse.setCharAt(startIndex, sbVowelReverse.charAt(endIndex));
          sbVowelReverse.setCharAt(endIndex,tempChar);
        startIndex++;
        endIndex--;
        }
      }
      return sbVowelReverse.toString();
  }
}
