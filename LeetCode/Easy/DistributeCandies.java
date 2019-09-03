/**
 *  https://leetcode.com/problems/distribute-candies-to-people/submissions/
 *  Distribute candies to people according to the rules
 *  @Author EnMedina
 */


class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int index = 0;
        int currCandy = 1;
        int[] candy = new int[num_people];
        while( candies >= currCandy){
            candy[index++] += currCandy;
            if(index == num_people) index = 0;
            candies -= currCandy++;
        }
        candy[index] += candies;
        return candy;
    }
}
