/**
 *  https://leetcode.com/problems/heaters/submissions/
 *  return the minimun radious for heaters
 *  @Author ENMedina
 */
class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        if( houses == null || houses.length == 0 ) return 0;
        if( houses == null || heaters.length == 0 ) return 0;
        Arrays.sort(houses);
        Arrays.sort(heaters);
        int heaterIdx = 0;
        int res = 0;
        for (int i = 0; i < houses.length; i++) {
            while (heaterIdx != heaters.length - 1 && Math.abs(heaters[heaterIdx + 1] - houses[i]) <= Math.abs(heaters[heaterIdx] - houses[i])) {
                heaterIdx++;
            }
            
            res = Math.max(res, Math.abs(heaters[heaterIdx] - houses[i]));
        }
        
        return res;
    }
}

