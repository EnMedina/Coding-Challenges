
/**
 * https://leetcode.com/problems/unique-number-of-occurrences/
 * Return whether numbers occurr an uniquely amount of times
 * @author EMMEDINA
 */
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> occurrenceMap = new HashMap<>();
        for( int num : arr ) {
        	occurrenceMap.put(num, occurrenceMap.getOrDefault(num, 0)+1);
        }
        Set<Integer> occurrenceCounts = new HashSet<>();
        
        for( int key : occurrenceMap.keySet() ) {
        	if( occurrenceCounts.contains(occurrenceMap.get(key))) return false;
        	occurrenceCounts.add(occurrenceMap.get(key));
        }
        
        return true;
    }
}
