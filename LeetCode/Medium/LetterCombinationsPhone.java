/**
 * https://leetcode.com/problems/letter-combinations-of-a-phone-number
 * Return the possible letter combinations of a phone number
 * @Author EnMEdina
 *
 * BackTracking
 */

class Solution {
    public List<String> letterCombinations(String digits) {
        String[] charList = new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> combinations = new ArrayList<>();
        if( digits.length() == 0 ) return combinations;
        backtracking( charList , digits, "" , combinations );
        return combinations;
    }
    
    
    private void backtracking( String[] mapping, String digits,  String currString , List<String> letterList) {
        if( currString.length() == digits.length() ){
            letterList.add( currString );
            return;
        }
        int currLettersI = Integer.parseInt(""+ digits.charAt( currString.length() )) ;
        
        for( char c : mapping[currLettersI].toCharArray()){
            backtracking( mapping, digits, currString + c , letterList );
        }
        
        return;
    }
}
