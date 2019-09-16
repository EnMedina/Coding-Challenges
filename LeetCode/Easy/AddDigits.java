/**
 * https://leetcode.com/problems/add-digits/submissions/ 
 * While a number is higher than 10 return the sum of its digits
 * @Author EnMedina
 */

class Solution {
    public int addDigits(int num) {
      while( num > 9){
        int temp = 0;
        while(num > 0){
          temp+= num %10 ;
          num/= 10;
        }
        num = temp;
      }
      return num;
    }
}
