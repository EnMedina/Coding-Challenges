/**
 * https://leetcode.com/problems/find-and-replace-pattern/submissions/
 * Return how many Strings match a given pattern
 * @Author EnMedina
 */


class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> matchingStrings = new ArrayList<>();
        for( String word : words){
            if( patternMatches(word,pattern)){
                matchingStrings.add(word);
            }
        }
        return matchingStrings;
    }
    
    private boolean patternMatches(String a, String b){
        if( a.length() != b.length() ) return false;
        Map<Character, Character> charMappingsA=  new HashMap<>();
        Map<Character, Character> charMappingsB = new HashMap<>();
        for( int i = 0 ; i < a.length() ; i++ ){
            if(charMappingsB.containsKey(b.charAt(i))){
                if( charMappingsB.get(b.charAt(i)) != a.charAt(i)){
                    return false;
                }
            }else{
                if( charMappingsA.containsKey(a.charAt(i))) return false;
                else{
                    charMappingsB.put( b.charAt(i), a.charAt(i));
                    charMappingsA.put( a.charAt(i), b.charAt(i));
                }
            }
        }
        return true;
    }
}
