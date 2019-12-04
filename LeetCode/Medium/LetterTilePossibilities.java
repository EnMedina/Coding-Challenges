/**
 *  https://leetcode.com/problems/letter-tile-possibilities/
 *  Return the possible permutations
 *  @Author EnMedina
 *
 *  Backtracking
 */

class Solution {
    public int numTilePossibilities(String tiles) {
        int[] charCount = new int[27];
        for( char c : tiles.toCharArray() ){
            charCount[c-'A']++;
        }
        return possibleTiles(  charCount );
    }
    
    
    private int possibleTiles( int[] arr )  {
        int currCount = 0;
        for( int i = 0 ; i < arr.length ; i++ ){
            if( arr[i] != 0 ){
                currCount++;
                arr[i]--;
                currCount+= possibleTiles( arr );
                arr[i]++;
            }
        }
        return currCount;
    }
    
}
