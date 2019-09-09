/**
 * https://leetcode.com/problems/intersection-of-two-arrays/
 * Return the unique intersection of two arrays
 * @Author EnMedina
 */

public class IntersectionTwoArrays{
    public static void main(String[] args){
        System.out.println(getArraysIntersection(new int[]{1,2,2,3}, new int[]{2,2}));

    }   
    // This method is O(N) time, O(N) Space
    private static int[] getArraysIntersection(int[] nums1, int[] nums2){
    Set<Integer> numbers1 = new HashSet<>();
    Set<Integer> numbers2 = new HashSet<>();
    for( int num : nums1 ) numbers1.add(num);
    for( int num : nums2 ) numbers2.add(num);

    //Generate a list with the common elements
    numbers1.retainAll(numbers2);

    //Return the HashSet as an array
    return numbers1.stream().mapToInt(Integer::intValue).toArray();
    
    }

}
