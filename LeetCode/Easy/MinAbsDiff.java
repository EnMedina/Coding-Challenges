/**
 *  https://leetcode.com/problems/minimum-absolute-difference/submissions/
 *  Return a list of the minimum absolute difference pairs
 * @Author EnMedina
 */


class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        
        Arrays.sort(arr);
        //System.out.println(Arrays.toString(arr));
        
        int minDiff = Integer.MAX_VALUE;
        
        List<List<Integer>> minDiffList = new ArrayList<>();
        for( int i = 1 ; i < arr.length ; i++ ){
            if( Math.abs(arr[i-1] - arr[i]) < minDiff ){
                minDiffList = new ArrayList<>();
                minDiff = Math.abs( arr[i-1] - arr[i] ); 
                List<Integer> tempList = new ArrayList<>();
                tempList.add(arr[i-1]);
                tempList.add(arr[i]);
                minDiffList.add(tempList);
            }else if( Math.abs( arr[i-1] - arr[i] ) == minDiff  ){
                List<Integer> tempList = new ArrayList<>();
                tempList.add( arr[i-1] );
                tempList.add( arr[i]);
                minDiffList.add(tempList);
            }
            
        }
        
        return minDiffList;
    }
}
