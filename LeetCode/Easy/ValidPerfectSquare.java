/**
 * https://leetcode.com/problems/valid-perfect-square
 * Return whether a number is perfect square, without sqrt
 * @Author EnMedina
 */

class Solution {
    public boolean isPerfectSquare(int num) {
        int low = 1, high = num ;
        while (low <= high) {
            long mid = (low + high) / 2;
            if (mid * mid == num) {
                return true;
            } else if (mid * mid < num) {
                low = (int) mid + 1;
            } else {
                high = (int) mid - 1;
            }
        }
        return false;
    }   
        
      
}

