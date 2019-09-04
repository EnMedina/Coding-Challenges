/**
 *  https://leetcode.com/problems/number-complement/submissions/
 *  Return a numbers complement, that is inverse digits
 **/

class Solution {
    public int findComplement(int num) {
        int complementNum = 0;
        long currPower =(long) Math.pow(2,32);
        while(num < currPower)currPower /= 2;
        
        while(currPower > 0){
            if(num >= currPower){
                num -= currPower;
            }else{
                complementNum += currPower;
            }
            currPower/=2;
        }
        return complementNum;
    }
}
