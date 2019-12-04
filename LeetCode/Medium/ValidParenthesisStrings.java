/**
 *  https://leetcode.com/problems/generate-parentheses/submissions/
 *  Return valid given length parentheses strings
 *  @Author EnMedina
 *
 *  BackTracking
 */


class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> validList = new LinkedList<>();
        backtracking( n , n , n*2 , "", validList);
        return validList;
    }
    
    private void backtracking( int remainingOpen, int remainingClosed , int n , String currStr , List<String> parentList ){
        if( currStr.length() == n ){
            //if( isValidParentheses(currStr))
            parentList.add(currStr);
            return;
        }
        if( remainingOpen > 0)
            backtracking( remainingOpen-1 , remainingClosed , n , currStr + "(" , parentList);
        if( remainingClosed > remainingOpen )
            backtracking( remainingOpen , remainingClosed-1 , n , currStr + ")" , parentList);
        return ;
    }
    
   
}
