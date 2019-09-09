/**
 *  https://leetcode.com/problems/next-greater-element-i/submissions/
 *  Return the next greater of two arrays
 *  @Author EnMedina
 */

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer> num2Indexes = new HashMap<>();
        for(int i = 0 ; i < nums2.length ; i++){
            num2Indexes.put(nums2[i],i);
        }
        
        int[] answers = new int[nums1.length];
        for(int i = 0 ; i < nums1.length ; i++){
            int startIndex = num2Indexes.get(nums1[i]);
            boolean foundGreater = false;
            int nextGreater = -1 ;
            while( startIndex < nums2.length && !foundGreater ){
                //System.out.println("Trying for " + nums2[startIndex]);
                if( nums2[startIndex] > nums1[i] ){
                    foundGreater = true;
                    nextGreater = nums2[startIndex];
                }
                startIndex++;
            }
            answers[i] = nextGreater;
        }
        
        return answers;
        
        
        
    }
}
