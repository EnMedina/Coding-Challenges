/** 
 * https://leetcode.com/problems/third-maximum-number/submissions/
 * Return the third biggest number in an array, otherwise biggest
 * @Author EnMedina
 */

class Solution {
    public int thirdMax(int[] nums) {
        long[] maxNums = new long[3];
        for( int i = 0 ; i < maxNums.length ; i++ ) maxNums[i] = Long.MIN_VALUE;
        for( int num : nums ){
            if( num >= maxNums[0] ){
                if( num > maxNums[0]){
                    maxNums[2] = maxNums[1];
                    maxNums[1] = maxNums[0];
                    maxNums[0] = num;
                }
            }
            else if( num >= maxNums[1] ){
                    if( num > maxNums[1] ){
                        maxNums[2] = maxNums[1];
                        maxNums[1] = num;
                    }
            }
            else if( num > maxNums[2]){
                    maxNums[2] = num;
            }
            //System.out.println(Arrays.toString(maxNums));
        }
        if( maxNums[2] == Long.MIN_VALUE ) return (int)maxNums[0];
        return (int)  maxNums[2];
    }
    
}
