/**
 *  https://leetcode.com/problems/lemonade-change/submissions/
 *  Return whether we can give change to lemonade buyers
 *  @Author EnMedina
 */

class Solution {
    public boolean lemonadeChange(int[] bills) {
        int[] change = new int[2];
        for( int currentBill : bills){
            if(currentBill == 5){
                change[0]++;
            }else if(currentBill == 10){
                if( change[0] == 0) return false;
                change[0]--;
                change[1]++;
            }else{
                if( change[1] != 0){
                    if(change[0] == 0) return false;
                    change[1]--;
                    change[0]--;
                }else if( change[0] >= 3){
                    change[0]-=3;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}
