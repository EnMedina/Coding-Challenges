/**
 * https://leetcode.com/problems/uncommon-words-from-two-sentences/submissions/ 
 * Return the uncommon words between the two sentences
 * @Author EnMedina
 */


class Solution {
    public String[] uncommonFromSentences(String A, String B) {
        String[] wordsA = A.split(" ");
        String[] wordsB = B.split(" ");
        
        HashMap<String,Integer> uncommon = new HashMap<>();
        for( String word : wordsA){
            if(uncommon.keySet().contains(word)){
                uncommon.put(word,2);
            }
            else{
                uncommon.put(word,1);
            }
        }
        for( String word : wordsB){
            if(uncommon.keySet().contains(word)){
                uncommon.put(word,2);
            }
            else{
                uncommon.put(word,1);
            }
        }
        
        List<String> uncommonWords = new ArrayList<>();
        for( String word : uncommon.keySet()){
            if(uncommon.get(word) == 1) uncommonWords.add(word);
        }
        
        
        return uncommonWords.toArray(new String[uncommonWords.size()]);
    }
}
