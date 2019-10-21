
/**
 * https://leetcode.com/problems/word-pattern/
 * Return whether a word pattern is being followed 
 * @author EMEDINA
 *	O(n) time O(n) space
 */
class Solution {
	public boolean wordPattern(String pattern, String str) {
    	String[] words = str.split(" ");
    	if( pattern.length() != words.length ) return false;
        //System.out.println(" Starting comparison");
    	Map<String, Character> wordMapping = new HashMap<>();
    	Map<Character, String> charMapping = new HashMap<>();
    	
    	for( int i = 0 ; i < pattern.length() ; i++ ) {
    		if( wordMapping.keySet().contains(words[i]) ) {
    			if( wordMapping.get( words[i]) != pattern.charAt(i) ) {
                    //System.out.println( "Failed when comparing " + wordMapping.get(pattern.charAt(i)) +" and " +  words[i] ); 
    				return false;
    			}
    		}else {
    			wordMapping.put(words[i], pattern.charAt(i) );
    		}
    		
    		
    		if( charMapping.keySet().contains(pattern.charAt(i)) ) {
    			if( !charMapping.get(pattern.charAt(i)).equals(words[i]) ) {
                    //System.out.println( "Failed when comparing " + wordMapping.get(pattern.charAt(i)) +" and " +  words[i] ); 
    				return false;
    			}
    		}else {
    			charMapping.put( pattern.charAt(i), words[i] );
    		}
    		
    		
    	}
    	return true;
    }

}
