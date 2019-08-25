/**
 *  https://leetcode.com/problems/matrix-cells-in-distance-order/
 *  Return the coordinates of a matrix sorted by distance to r0,c0
 */

class Solution {
    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        Map<Integer,LinkedList<Coordinate>> coordinateDistance = new TreeMap<>();
        for(int row = 0 ; row < R ; row++ ){
            for( int col = 0 ; col < C ; col++ ){
                int tempDistance = Math.abs( row - r0 ) + Math.abs( col - c0 );
                LinkedList<Coordinate> tempList;
                if(coordinateDistance.keySet().contains(tempDistance)) tempList = coordinateDistance.get(tempDistance);
                else tempList = new LinkedList<>();
                tempList.add(new Coordinate(row,col));
                coordinateDistance.put(tempDistance,tempList);
            }
        }
        
        int[][] distances = new int[C*R][2];
        int distanceI = 0;
        for( int distance : coordinateDistance.keySet()){
            LinkedList<Coordinate> tempList = coordinateDistance.get(distance);
            for( Coordinate coordinate : tempList ){
                distances[distanceI++] = new int[]{coordinate.r,coordinate.c};    
            }
        }
        return distances;
    }
}

class Coordinate{
    public int r;
    public int c;
    
    Coordinate(int r , int c){
        this.r = r;
        this.c = c;
    }
}
