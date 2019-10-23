
/**
 * https://leetcode.com/problems/longest-word-in-dictionary/
 * REturn the longest word in a dictionary that can be made from previous words
 * @author EMEDINA
 *
 */

class Solution {
  public String longestWord( String[] dict){
    Set<String> words = new HashSet<>();
    for( String word : dict) words.add(word);
    
    int currLen = 0;
    String currWord = "";
    
    for( String word : dict ) {
      boolean validWord = true;
      for( int i = word.length() ;validWord && i > 0 ; i-- ) {
        if( !words.contains(word.substring(0, i) ) ) validWord = false;
      }
      
      if( validWord ) {
        if( word.length() > currLen ) {
          currWord = word;
          currLen = word.length();
        }
        else if( word.length() == currLen) {
          if( currWord.compareTo(word) > 0) {
            currWord = word;
          }
        }
      }
    }
    return currWord;
    
  } 
}

