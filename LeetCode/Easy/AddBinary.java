


/**
 * https://leetcode.com/problems/add-binary/
 * Add two binary numbers
 * @Author EnMedina
 */

class Solution {
  public String addBinary(String a, String b) {
      //a will always hold the longest
      if( b.length() > a.length() ){
          String temp = a;
          a = b;
          b = temp;
      }
      StringBuilder sum = new StringBuilder();
      int indexA = a.length()-1;
      int indexB = b.length()-1;
      boolean carry = false;
      while( indexB >= 0 ){
        if( a.charAt(indexA) == '1' && b.charAt(indexB) == '1') {
          sum.insert(0, carry ? '1':'0');
          carry = true;
        }else if( a.charAt(indexA) == '1' || b.charAt(indexB) == '1' ) {
          sum.insert(0, carry ? '0' : '1' );
        }else {
          sum.insert(0, carry ? '1' : '0');
          carry = false;
        }

        indexA--;
        indexB--;
      }
      while( indexA >= 0 ) {
        if( carry ) {
          sum.insert( 0 , a.charAt(indexA) == '1' ? '0' : '1');
          carry = a.charAt(indexA) == '1' ? true : false;
        } else {
          sum.insert(0, a.charAt(indexA));
        }
        indexA--;
      }
      if( carry ) sum.insert(0, '1');
      return sum.length() > 0 ? sum.toString() : "0";
  }
}
