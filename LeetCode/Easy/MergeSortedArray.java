/**
 *  https://leetcode.com/problems/merge-sorted-array/
 *  Merge two sorted arrays into the first one
 *  @Author EnMedina
 */

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if( n == 0 ) return ;
        // Move elements n spots to the right;
        for( int i = m - 1 ; i >= 0 ; i-- ){
            nums1[i+n] = nums1[i];
            nums1[i] = 0;
        }
       //System.out.println(Arrays.toString(nums1)); 
        //Creat pointers for elements in nums1, nums2 and current Index
        int pointerCurrI = 0;
        int pointerNums1 = n;
        int pointerNums2 = 0;
        while( pointerCurrI < n+m ){
            if( pointerNums2 == nums2.length || pointerNums1 < n+m &&  nums1[pointerNums1] < nums2[pointerNums2]){
                nums1[pointerCurrI] = nums1[pointerNums1];
                pointerNums1++;
            }else{
                nums1[pointerCurrI] = nums2[pointerNums2];
                pointerNums2++;
            }
            pointerCurrI++;
            //System.out.println("Current pointers " + pointerNums1 + ", " + pointerNums2);
        }
        
        while( pointerCurrI < nums1.length ){
            nums1[pointerCurrI] = 0;
            pointerCurrI++;
        }
        
        
    }
}
