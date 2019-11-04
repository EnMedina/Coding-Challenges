
 /**
 * https://leetcode.com/problems/string-compression/
 * Compress a String in place
 * @author EMEDINA
 */

class Solution {
  public int compress(char[] chars) {
    int currCount = 0;
    int transformI = 0;
    for( int i = 0 ; i < chars.length ; i++ ) {
      currCount++;
      chars[transformI] = chars[i];
      int repetitionsFound = 1;
      while( i < chars.length-1 && chars[i] == chars[i+1] ) {
        i++;
        repetitionsFound++;
      }
      if( repetitionsFound != 1 ) {
        String repetitionsStr = String.valueOf(repetitionsFound);
        currCount += repetitionsStr.length();
        for( int j = 0 ; j < repetitionsStr.length() ; j++ ) {
          transformI++;
          chars[transformI] = repetitionsStr.charAt(j);
          
        }
      }
      transformI++;
    }
    
    return currCount;
  }
}

