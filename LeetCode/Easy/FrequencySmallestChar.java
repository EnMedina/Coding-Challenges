/**
 * https://leetcode.com/problems/compare-strings-by-frequency-of-the-smallest-character/ 
 * Return the number of strings with lower values
 **/

class Solution {
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
      int[] frequencies = new int[words.length];
      int[] answers = new int[queries.length];
      
      
      for( int i = 0 ; i < words.length ; i++ ){
          frequencies[i] = frequency(words[i]);
        }
      Arrays.sort(frequencies);
      //System.out.println(Arrays.toString(frequencies));
      
      for( int i = 0 ; i < queries.length ; i++ ){
        int currFrequency = frequency(queries[i]);
        //System.out.println("Frequency for " + queries[i] + " is " + currFrequency);
        int currValue = frequencies.length -1 ;
        while(currValue >= 0 && currFrequency < frequencies[currValue])currValue--;
        answers[i] = frequencies.length - currValue - 1;
      }
      
      
      return answers;
    }
  
    private int frequency(String s){
      TreeMap<Character, Integer> charCounts = new TreeMap<>();
      for( int i = 0 ; i < s.length() ; i++ ){
        int occurrences = 1;
        if(charCounts.keySet().contains(s.charAt(i))){
          occurrences = charCounts.get(s.charAt(i)) + 1;
        }
        charCounts.put(s.charAt(i),occurrences);
      }
      
      return charCounts.firstEntry().getValue();
    }
  
}
