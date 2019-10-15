/**
 *  https://leetcode.com/problems/excel-sheet-column-title/submissions/
 *  Return the excel column for a number
 *  @Author EnMedina
 */

class Solution {
    public String convertToTitle(int n) {
        List<Character> rowVals = new ArrayList<>();
        String excelColumn = "";
          while(n > 0 ){
              n-= 1;
              rowVals.add((char) ( 'A' + n%26));
              n /= 26;
          }
        
        for( char c : rowVals ){
            excelColumn = c + excelColumn;
        }
          //System.out.println(rowVals);
          return excelColumn;
    }
}
