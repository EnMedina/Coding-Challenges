/**
 * https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/
 *  Remove all adjacent duplicates from a string
 *  @Author EnMedina
 */

class Solution {
    public String removeDuplicates(String S) {
        StringBuilder sb = new StringBuilder(S);
        int currIndex = 0;
        boolean foundDuplicate = false;
        while( currIndex < sb.length() - 1 ){
            if( sb.charAt(currIndex) == sb.charAt(currIndex+1)){
                foundDuplicate = true;
                sb.deleteCharAt(currIndex+1);
                sb.deleteCharAt(currIndex);
            }
            
            if(foundDuplicate){
                foundDuplicate = false;
                currIndex--;
            }
            else{
                currIndex++;
            }
            if(currIndex < 0) currIndex = 0;
        }
        return sb.toString();
    }
}
