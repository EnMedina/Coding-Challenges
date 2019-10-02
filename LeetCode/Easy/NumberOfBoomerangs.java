/**
 * https://leetcode.com/problems/number-of-boomerangs/submissions/
 * Return the number of available boomerangs
 * @Author EnMedina
 */

class Solution {
    public int numberOfBoomerangs(int[][] points) {
        double[][] distances = new double[points.length][points.length];
        
        for( int currPoint = 0 ; currPoint < points.length ; currPoint++ ){
            for( int currCalc = 0 ; currCalc < points.length ; currCalc++ ){
                distances[currPoint][currCalc] = Math.sqrt(Math.pow(points[currCalc][0]-points[currPoint][0],2) + Math.pow(points[currCalc][1]-points[currPoint][1],2));
            }
        }
        
        for( int i = 0 ; i  < points.length ; i++ ){
            Arrays.sort(distances[i]);
        }
       
         

        //for( int i = 0 ; i  < points.length ; i++ ){
        //    System.out.println(Arrays.toString(distances[i]));
        //}
        
        int maxBoomerangs = 0 ;
        for( int pointInd = 0 ; pointInd < points.length ; pointInd++ ){
            for( int i = 2 ; i < points.length ; i++ ){
                int currRep = 0;
                while(i < points.length && distances[pointInd][i] == distances[pointInd][i-1])
                {
                    currRep++;
                    i++;
                }
                if(currRep == 1) maxBoomerangs += 2;
                else if( currRep > 1) maxBoomerangs += 3 * ((int) Math.pow(2,currRep-1));
                //System.out.println("Current boomerangs: " + maxBoomerangs);
            }
                                                             
        }
        
        return maxBoomerangs;
    }
}
