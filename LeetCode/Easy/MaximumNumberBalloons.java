/**
 *  https://leetcode.com/problems/maximum-number-of-balloons/submissions/
 *  Return the max number of times you can put the word balloon as substring
 *  @Author EnMedina
 */

class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] characters = new int[26];
        for( int i = 0 ; i < text.length() ; i++ ){
            characters[text.charAt(i) - 'a' ]++;
        }
        int maxBalloons = Integer.MAX_VALUE;
        maxBalloons = Math.min( maxBalloons , characters[0] );
        maxBalloons = Math.min( maxBalloons , characters[1] );
        maxBalloons = Math.min( maxBalloons , characters[11]/2 );
        maxBalloons = Math.min( maxBalloons , characters[14]/2 );
        
        return maxBalloons;
        
        
    }
}
