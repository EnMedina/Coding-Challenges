/**
 *  https://leetcode.com/problems/construct-the-rectangle/submissions/
 *  Return the size of the webpage rectangle according to needs
 *  @Author EnMedina
 */

class Solution {
    public int[] constructRectangle(int area) {
        int limit = (int) Math.sqrt(area);
        boolean foundDivisor = false;
        int length = 0;
        int width = 0;
        while(limit > 0 && !foundDivisor){
            if(area % limit == 0){
                width = limit;
                length = area/limit;
                foundDivisor = true;
            }
            limit--;
        }
        int[] constructedWebsite = new int[2];
        constructedWebsite[0] = length;
        constructedWebsite[1] = width;
        
        
        return constructedWebsite;
    }
}
