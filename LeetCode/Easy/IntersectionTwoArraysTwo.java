/**
 *  https://leetcode.com/problems/intersection-of-two-arrays-ii/submissions/
 *  Return the intersection of two arrays
 *  @Author EnMedina
 */

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> intersection = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        int indNum1 = 0;
        int indNum2 = 0;
        
        while( indNum1 < nums1.length && indNum2 < nums2.length ){
            while(indNum1 < nums1.length && nums1[indNum1] < nums2[indNum2]){
                indNum1++;
            }
            //System.out.println("To be compared Indexes are : " + indNum1 + ", " + indNum2);
            
            while( indNum1 < nums1.length && indNum2 < nums2.length && nums1[indNum1] == nums2[indNum2]){
                intersection.add(nums1[indNum1]);
                indNum1++;
                indNum2++;
            }
            while( indNum2 < nums2.length && indNum1 < nums1.length && nums2[indNum2] < nums1[indNum1]) indNum2++;
            
            //System.out.println("Current Indexes are : " + indNum1 + ", " + indNum2);
        }
        
        int[] arrIntersection = new int[intersection.size()];
        for( int i = 0 ; i < intersection.size() ; i++ ){
            arrIntersection[i] = intersection.get(i);
        }
        return arrIntersection;
    }
}

