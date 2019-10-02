 /**
 * Return the shortest highest degree subarray in an array
 * @Author EnMedina
 */
class Solution {
    public int findShortestSubArray(int[] nums) {
        if(nums == null || nums.length < 1) return 0;
        Map<Integer,ArrayList<Integer>> indexes = new HashMap<>();
        for( int numInd = 0 ; numInd < nums.length ; numInd++ ){
            if(indexes.containsKey(nums[numInd])){
                indexes.get(nums[numInd]).add(numInd+1);
            }else{
                ArrayList<Integer> tempList = new ArrayList<>();
                tempList.add(numInd+1);
                indexes.put(nums[numInd],tempList);
            }
        }

        int maxDegree = 0;
        int shortestSub = Integer.MAX_VALUE;
        for( int key : indexes.keySet() ){
            List<Integer> tempList = indexes.get(key);
            if( tempList.size() > maxDegree ) {
                maxDegree = tempList.size();
                shortestSub = tempList.get(tempList.size()-1)-tempList.get(0)+1;
            }else if( tempList.size() == maxDegree ){
                shortestSub = Math.min(shortestSub, tempList.get( tempList.size() - 1 ) - tempList.get(0)+1);
            }
        }
        
        return shortestSub;

    }
}

