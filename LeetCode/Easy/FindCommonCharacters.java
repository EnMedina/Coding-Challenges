/**
 *  https://leetcode.com/problems/find-common-characters/
 *  Return a list of characters that appear in all the strings
 *  @Author EnMEdina
 */

class Solution {
    public List<String> commonChars(String[] A) {
        //Create an array recording minimum char comparisons
        int[] finalCharArr = new int[27];
        for(int i = 0 ; i < 27 ; i++ ){
            finalCharArr[i] = Integer.MAX_VALUE;
        }
        
        
        //Iterate each string and recording minimum values
        int[] tempCharArr;
        for( String s : A){
            tempCharArr = new int[27];
            for(int i = 0 ; i < s.length() ; i++){
                tempCharArr[s.charAt(i) - 'a']++;
            }
            for(int i = 0 ; i < 27 ; i++){
                finalCharArr[i] = Math.min(finalCharArr[i],tempCharArr[i]);
            }
        }
        
        //Create list with characters
        
        List<String> answer = new LinkedList<>();
        for( int i = 0 ; i < 27 ; i++ ){
            while(finalCharArr[i]-- > 0){
                answer.add(""+(char)(i+'a'));
            }
        }
        
        return answer;
    }
}
