
/**
 * https://leetcode.com/problems/restore-ip-addresses/
 * Return all possible subsets
 * @Author EnMedina
 * 
 * Backtracking
 */
class Solution {
  public List<String> restoreIpAddresses(String s) {
      List<String>  validIps = new LinkedList<>();
      List<Integer> currNums = new LinkedList<>();
      backtrack( validIps, currNums, 0, s );
      
      return validIps;
  }

  private void backtrack(List<String> validIps, List<Integer> currNums, int initialI, String s) {
    //System.out.println( "CurrList = " + currNums.toString() + " initialI= " + initialI );
    
    if( currNums.size() == 4 && initialI == s.length()) {
      StringBuilder sb = new StringBuilder();
      sb.append(currNums.get(0));
      for( int i = 1 ; i < currNums.size() ; i++ ) sb.append("."+currNums.get(i));
      validIps.add(sb.toString());
      return;
    }
    if( currNums.size() > 4 || initialI >= s.length()) return;
    for( int i = initialI+1 ; i < initialI+4 && i <= s.length() ; i++ ) {
      int currNum = Integer.parseInt(s.substring(initialI, i));
      if(  currNum < 256) {
        currNums.add(currNum);
        //System.out.println("Added " + s.substring(initialI, i));
        backtrack( validIps, currNums, i ,s );
        currNums.remove(currNums.size()-1);
        if(currNum == 0 ) break;
      }
    }
    return;
  }
}
