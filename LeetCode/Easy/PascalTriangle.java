/**
 *  https://leetcode.com/problems/pascals-triangle/submissions/
 *  Return the values of a N size Pascal triangle
 *  @Author EnMedina
 */

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalNums = new ArrayList<>();
        if(numRows == 0) return pascalNums;
        List<Integer> firstRow = new ArrayList();
        firstRow.add(1);
        pascalNums.add(firstRow);
        int currRow = 2;
        
        while( currRow <= numRows ){
            List<Integer> currRowList = new ArrayList<>();
            List<Integer> prevRowList = pascalNums.get(currRow-2);
            for( int numberIndex = 0 ; numberIndex < currRow ; numberIndex++ ){
                int currNumber = 0;
                if( numberIndex > 0) currNumber+= prevRowList.get(numberIndex-1);
                if( numberIndex < currRow-1 ) currNumber += prevRowList.get(numberIndex);
                currRowList.add(currNumber);
            }
            pascalNums.add(currRowList);
            currRow++;
            
        }
        
        return pascalNums;
    }
}
