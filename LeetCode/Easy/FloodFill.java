/**
 *  https://leetcode.com/problems/flood-fill/submissions/
 *  Flood fill an image
 *  @Author EnMedina
 */

class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        
        Deque<Integer> stackY = new LinkedList<>();
        Deque<Integer> stackX = new LinkedList<>();
        
        int originalColor = image[sr][sc];
        if(newColor == originalColor) return image;
        stackY.add(sr);
        stackX.add(sc);
        
        while( !stackY.isEmpty()){
            int currY = stackY.remove();
            int currX = stackX.remove();
            image[currY][currX] = newColor;
            if( needsFilling(image, currY+1 , currX , originalColor)){
                stackY.add(currY+1);
                stackX.add(currX);
            }
            if( needsFilling(image, currY-1 , currX , originalColor)){
                stackY.add(currY-1);
                stackX.add(currX);
            }
            if( needsFilling(image, currY , currX-1 , originalColor)){
                stackY.add(currY);
                stackX.add(currX-1);
            }
            if( needsFilling(image, currY , currX+1 , originalColor)){
                stackY.add(currY);
                stackX.add(currX+1);
            }
        }
        return image;
    }
    
    private boolean needsFilling(int[][] image, int y , int x, int originalColor){
        if( y < 0 || y >= image.length || x < 0 || x >= image[0].length) return false;
        return image[y][x] == originalColor;
    }
}
