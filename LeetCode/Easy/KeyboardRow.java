/**
 * https://leetcode.com/problems/keyboard-row/submissions/
 * Return list of Strings that can be typed with a single row
 **/


class Solution {
    public String[] findWords(String[] words) {
    
     Map<Character,Integer> rows = new HashMap<>();
     
     String row = "qwertyuiopQWERTYUIOP";
     for(int i = 0 ; i < row.length() ; i++ ){
       rows.put(row.charAt(i), 1);
     } 
      
     row = "asdfghjklASDFGHJKL";
     for(int i = 0 ; i < row.length() ; i++ ){
       rows.put(row.charAt(i), 2);
     } 
      
     row = "zxcvbnmZXCVBNM";
     for(int i = 0 ; i < row.length() ; i++ ){
       rows.put(row.charAt(i), 3);
     } 
      
     List<String> possibleWords = new ArrayList<>();
     for( String s : words ){
       int currRow = rows.get(s.charAt(0));
       boolean onlyOneRow = true;
       for( int i = 0 ; i < s.length() ; i++ ){
         if( rows.get(s.charAt(i)) != currRow ){
           onlyOneRow = false;
           break;
         }
       }
       if(onlyOneRow) possibleWords.add(s);
     }
      return possibleWords.toArray(new String[0]);
    }
}
