/**
 * https://leetcode.com/problems/add-strings/
 * Sum two numbers represented as Strings
 * @Author EnMedina
 */

class Solution {
    public String addStrings(String num1, String num2) {
      StringBuilder sb = new StringBuilder();

      //Have always the smallest in num2
      if( num2.length() > num1.length()){
        String temp = num1;
        num1 = num2;
        num2 = temp;
      }

      //Be mindful of carry
      boolean carry = false;
      int ind1 = num1.length()-1;
      int ind2 = num2.length()-1;
      while( ind2 >= 0 ){
          int currDigit = carry ? 1 : 0;
          carry = false;
          currDigit += num1.charAt(ind1) + num2.charAt(ind2) - 48 - 48; //Summing the two characters
          if( currDigit > 9 ) {
              currDigit -= 10;
              carry = true;
          }
          sb.append(currDigit);
          ind1--;
          ind2--;
      }
      while( carry && ind1 >= 0 && num1.charAt(ind1) == '9') {
          sb.append('0');
          ind1--;
      }
      while( ind1 >= 0){
          if( carry ){
              sb.append((char)(num1.charAt(ind1)+1));
              carry = false;
          } else{
              sb.append(num1.charAt(ind1));
          }
          ind1--;
      }
      if( carry ) sb.append('1');
      return sb.reverse().toString();


    }
}
