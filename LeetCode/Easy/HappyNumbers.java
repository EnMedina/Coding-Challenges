/**
 *  https://leetcode.com/problems/happy-number/submissions/
 *  Return whether a number is happy or not
 *  @Author EnMedina
 */

class Solution {
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        while( !seen.contains(n) && n != 1 ){
            seen.add(n);
            int newN = 0;
            while( n != 0 ){
                newN += (int) Math.pow(n%10,2);
                n /= 10;
            }
            n = newN;
        }
        
        return n == 1;
            
    }
}
