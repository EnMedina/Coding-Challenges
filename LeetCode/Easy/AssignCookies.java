/**
 * https://leetcode.com/problems/assign-cookies/submissions/
 * Return how many kids you can make happy with cookies
 * @Author EnMedina
 */


class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int happyChildren = 0;
        int cookieIndex = 0;
        for( int childIndex = 0 ; cookieIndex < s.length && childIndex < g.length ; childIndex++ ){
            while(cookieIndex < s.length &&  g[childIndex] > s[cookieIndex]){
                cookieIndex++;
            }
            if( cookieIndex < s.length){
                happyChildren++;
                cookieIndex++;
            }
        }
        
        return happyChildren;
    }
}
