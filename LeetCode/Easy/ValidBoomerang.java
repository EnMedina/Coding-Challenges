/**
 * https://leetcode.com/problems/valid-boomerang
 * Return whether the given three points are a boomerang
 * @Author EnMedina
 */

class Solution {
    public boolean isBoomerang(int[][] points) {
        //If any two points are the same return false;
        if(points[0][0] == points[1][0] && points[0][1] == points[1][1]) return false;
        if(points[1][0] == points[2][0] && points[1][1] == points[2][1]) return false;
        if(points[0][0] == points[2][0] && points[0][1] == points[2][1]) return false;
        
        //Inclinations must be different between 1 to 2 and to 3
        //System.out.println("Checking based on inclination ");
        //System.out.println("Inclination from 1 to 2 : " + calculateInclination(points[0],points[1])); 
        //System.out.println("Inclination from 1 to 3 : " + calculateInclination(points[0],points[2]));
        return calculateInclination(points[0],points[1]) != calculateInclination(points[0],points[2]);
    }
    
    private double calculateInclination(int[] pointa, int[] pointb){
        if( pointa[0] < pointb[0]){
            int[] temp = pointa;
            pointa     = pointb;
            pointb     = temp;
        }
        
        if( pointa[0] == pointb[0] ) return 0.0;
        if( pointa[1] == pointb[1] ) return Double.MIN_VALUE;
        return ((double)(pointa[1]-pointb[1]))/((double)(pointa[0]-pointb[0]));
    }
}
