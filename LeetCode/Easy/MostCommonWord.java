
/**
 * https://leetcode.com/problems/most-common-word/
 * Return the most frequent, non banned word
 * @Author EnMedina
 */
class Solution {
  public String mostCommonWord(String paragraph, String[] banned) {
      Set<String> bannedSet = new HashSet<>();
      Map<String, Integer> occurrences = new HashMap<>();
      for( String s : banned) bannedSet.add(s);
      paragraph = paragraph.toLowerCase();
      
      int startPointer = 0;
      int endPointer = 0;
      while( endPointer < paragraph.length() ) {
        while( startPointer < paragraph.length() && !Character.isLetter(paragraph.charAt(startPointer))) {
          startPointer++;
        }
        endPointer = startPointer;
        //System.out.println(endPointer);  
        while( endPointer < paragraph.length() && Character.isLetter(paragraph.charAt(endPointer) ) ) {
          endPointer++;
        }
        //System.out.println(endPointer);
        String currWord = paragraph.substring(startPointer,endPointer);
        if( !bannedSet.contains(currWord ) && !currWord.equals("") ) {
          occurrences.put(currWord, occurrences.getOrDefault(currWord, 0)+1);
        }
        
        startPointer = endPointer;
      }
      
      String mostCommon = "";
      int occMostCommon = 0;
      //System.out.println( "Words saved : " + occurrences.size() ); 
      for( String word : occurrences.keySet()) {
        if( occMostCommon < occurrences.get(word)) {
          occMostCommon = occurrences.get(word);
          mostCommon = word;
        }
      }
      return mostCommon;
  }
}
