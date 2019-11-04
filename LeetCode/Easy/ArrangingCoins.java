/**
 * https://leetcode.com/problems/arranging-coins/
 * Return the number of complete stairs that can be made with n coins
 * @Author ENMedina
 */

class Solution {
    public int arrangeCoins(int n) {
       //n = (x + 1) * x / 2
       return (int)((-1 + Math.sqrt(1 + 8 * (long)n)) / 2);
    }
}
