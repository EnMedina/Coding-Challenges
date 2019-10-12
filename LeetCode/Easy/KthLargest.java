/**
 *  https://leetcode.com/problems/kth-largest-element-in-a-stream/
 *  Create a data structure holding the kth largest element in a queue
 *  @Author EnMedina
 */
class KthLargest {
    
    List<Integer> numbers;
    int k ; 
    public KthLargest(int k, int[] nums) {
        this.k = k;
        Arrays.sort(nums);
        numbers = new ArrayList<Integer>();
        for( int num : nums) numbers.add(num);
    }
    
    public int add(int val) {
        numbers.add(val);
        Collections.sort(numbers);
        return numbers.get(numbers.size() - k);
    }
}
