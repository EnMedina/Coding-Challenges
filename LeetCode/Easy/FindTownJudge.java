/**
 *  https://leetcode.com/problems/find-the-town-judge/
 *  Return who the judge of the town is
 */

class Solution {
    public int findJudge(int N, int[][] trust) {
        int[][] trustMatrix = new int[N][N];
        for( int[] trustInstance : trust ){
            trustMatrix[trustInstance[0]-1][trustInstance[1]-1] = 1;
        }
        
        // for(int i = 0 ; i < N ; i++ ){
        //    System.out.println(Arrays.toString(trustMatrix[i]));
        //}

        
        boolean foundJudge = false;
        int judgeInd = -2;
        
        for(int index = 0 ; index < N ; index ++ ){
            boolean canBeJudge = true;
            for(int i = 0 ; i < N ; i++ ){
                if( (trustMatrix[index][i] != 0 || trustMatrix[i][index] != 1) && i != index){
                    canBeJudge = false;
                    break;
                }
            }
            if(canBeJudge){
                if(foundJudge){
                    judgeInd = -2;
                }
                else{
                    foundJudge = true;
                    judgeInd = index;
                }
            }
            
        }
        
        return judgeInd+1;
    }
}
