/**
 *  https://leetcode.com/problems/occurrences-after-bigram/submissions/
 *  Given words 1 and 2 return all words that appear after them.
 */

class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        String[] words = text.split(" ");
        List<String> thirdWords = new ArrayList<>();
        for(int i = 0 ; i < words.length - 2 ; i++){
            if(words[i].equals(first) && words[i+1].equals(second)){
                thirdWords.add(words[i+2]);
            }
        }
        return thirdWords.toArray(new String[thirdWords.size()]);
    }
}
