/**
 *  https://leetcode.com/problems/reorder-data-in-log-files/
 *  Reorder data logs according to content
 *  @Author EnMedina
 */

class Solution {
    public String[] reorderLogFiles(String[] logs) {
      // Get all the numeric logs to the back in the right order
      int indNum = logs.length - 1;
      int indLog = logs.length - 1;
      while( indLog >= 0){
        while( indLog >= 0 && !Character.isDigit( logs[indLog].charAt( logs[indLog].length() - 1 )  ) ) indLog--;
        if(indLog >= 0){
          String tempLog = logs[indNum];
          logs[indNum] = logs[indLog];
          logs[indLog] = tempLog;
          indNum--;
        }
      }
      
      // Get identifier length
     int idLength = 0;
     while( logs[0].charAt( idLength ) != ' ' ) idLength++;
     idLength -= 2; 

     Arrays.sort(logs, 0,indNum+1, 
             ( String a, String b) -> {
                int tempComp = a.substring(a.indexOf(' ')).compareTo( b.substring(b.indexOf(' ') ) );
                if(tempComp != 0) return tempComp;
                return Integer.valueOf(a.substring(idLength+1,a.indexOf(' '))).compareTo(Integer.valueOf(b.substring(idLength+1,b.indexOf(' '))));
             } );
      

      
      return logs;
    }
}                                                                                                                                                                                                       
