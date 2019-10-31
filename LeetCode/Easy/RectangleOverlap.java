
/**
 * https://leetcode.com/problems/rectangle-overlap/
 * Return whether two rectangles overlap
 * @Author EnMedina
 */

class Solution {
     public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
     if( rec1[0] > rec1[2]) swapPositions(rec1, 0); 
     if( rec1[1] > rec1[3]) swapPositions(rec1, 1); 
     if( rec2[0] > rec2[2]) swapPositions(rec2, 0); 
     if( rec2[1] > rec2[3]) swapPositions(rec2, 1);
     if( rec1[2] <= rec2[0] || rec1[0]>= rec2[2]) return false;
     if( rec1[3] <= rec2[1] || rec1[1]>= rec2[3]) return false;
     
     return true;
     
  }
    
  public int[] swapPositions( int[] rec, int i){
     int temp = rec[i];
     rec[i] = rec[i+2];
     rec[i+2] = temp;
     return rec;
  }
}
