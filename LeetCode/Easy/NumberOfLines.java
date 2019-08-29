/**
 * https://leetcode.com/problems/number-of-lines-to-write-string/submissions/
 * Return the number of lines needed to print a message
 * @Author EnMedina
 **/



class Solution {
    public int[] numberOfLines(int[] widths, String S) {
        if(S == null || S.length() == 0) return new int[]{0,0};
        int currLines = 1;
        int currChars = 0;
        for( int i = 0 ; i < S.length() ; i++ ){
            int currWidth = widths[S.charAt(i) - 'a'];
            if(currWidth + currChars > 100){
                currLines++;
                currChars = currWidth;
            }else{
                currChars += currWidth;
            }
        }
        return new int[]{currLines,currChars};
    }
}
