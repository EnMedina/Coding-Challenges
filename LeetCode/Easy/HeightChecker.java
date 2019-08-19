/**https://leetcode.com/problems/height-checker/submissions/
*Return the number of students standing in the wrong place
*@Autor EnMedina
**/
class Solution {
    public int heightChecker(int[] heights) {
        int[] sortedHeights = heights.clone();
      Arrays.sort(sortedHeights);
      int wrongPositions = 0;
      for(int i = 0 ; i < heights.length ; i++){
        if(heights[i] != sortedHeights[i] ) wrongPositions++;
      }
      return wrongPositions;
    }
}
