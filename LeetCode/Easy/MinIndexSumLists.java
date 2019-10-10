/**
 *  https://leetcode.com/problems/minimum-index-sum-of-two-lists/submissions/
 *  Return the list of minumum sum restaurants
 *  @Author EnMedina
 */

class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String,Integer> mapRestaurants1 = new HashMap<>();
        for( int i = 0 ; i < list1.length ; i++ ){
            mapRestaurants1.put(list1[i], i);
        }
        
        int minDiff = Integer.MAX_VALUE;
        ArrayList<String> minDiffList = new ArrayList<>();
        minDiffList.add("");
        for( int i = 0 ; i < list2.length ; i++ ){
            if(mapRestaurants1.keySet().contains(list2[i])){
                int tempDiff = Math.abs( mapRestaurants1.get(list2[i]) + i );
               // System.out.println( "For " + list2[i] + " the sum is " + tempDiff); 
                if( tempDiff < minDiff ){
                    minDiff = tempDiff;
                    minDiffList = new ArrayList<>();
                    minDiffList.add(list2[i]);
                }else if( tempDiff == minDiff ){
                    minDiffList.add(list2[i]);
                }
            }
        }
        
        String[] minDiffStrings = new String[minDiffList.size()];
        for( int i = 0 ; i < minDiffStrings.length ; i++ ){
            minDiffStrings[i] = minDiffList.get(i);
        }
        
        return minDiffStrings;
    }
}
