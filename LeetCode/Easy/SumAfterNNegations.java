/**
 *  https://leetcode.com/problems/maximize-sum-of-array-after-k-negations/
 *  REturn the sum of an array after N Negations
 *  @Author EnMedina
 */

class Solution {
    public int largestSumAfterKNegations(int[] A, int K) {
        Arrays.sort(A);
        int indA = 0 ;
        
        //First flip the negatives from bigger to smaller
        while ( indA < A.length && A[indA] < 0 && K > 0 ){
            A[indA] *= -1;
            indA++;
            K--;
        }
        if( K != 0 ){
            if( K % 2 == 1 ){
                System.out.println("We are here");
                int minDiff = Integer.MAX_VALUE;
                for( int num : A ) minDiff = Math.min(minDiff, Math.abs(num));
                A[0] -= minDiff*2;
               // System.out.println(Arrays.toString(A));
            }   
        }
        
        
        return Arrays.stream(A).sum();
    }
}
