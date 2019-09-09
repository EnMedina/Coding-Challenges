/**
 * https://leetcode.com/problems/last-stone-weight/submissions/
 * Smash the stones as described
 * @Author EnMEdina
 */



class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length < 2 ) return stones[0];
        Arrays.sort(stones);
        int nStones = stones.length;
        while(stones[nStones-2] != 0){
            int tempStone = stones[nStones-2];
            stones[nStones-2] = 0;
            stones[nStones-1] -= tempStone;
            Arrays.sort(stones);
        }
        
        return stones[nStones-1];
    }
}
