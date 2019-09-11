/**
 *  https://leetcode.com/problems/monotonic-array/submissions/
 *  Determine whether an array is monotonic or not
 *  @Author EnMedina
 */
class Solution {
    public boolean isMonotonic(int[] A) {
        boolean monotonic = true;
        for( int iArr = 0 ; monotonic && iArr < A.length - 1 ; iArr++ ){
            if( A[iArr] > A[iArr+1]) monotonic = false;
        }
        if(monotonic) return true;
        monotonic = true;
        for( int iArr = A.length-1 ; monotonic && iArr > 0 ; iArr-- ){
            if( A[iArr] > A[iArr-1]) monotonic = false;
        }
        return monotonic;
    }
}
