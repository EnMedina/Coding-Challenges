/**
 *  https://leetcode.com/problems/verifying-an-alien-dictionary/
 *  Return whether a list of words is sorted
 *  @Author EnMedina
 */

public class VerifyAlienDictionary{
    public boolean isAlienSorted(String[] words, String order) {
      Map<Character, Integer> mapCharOrder = new HashMap<>();
      for( int i = 0 ; i < order.length() ; i++ ) {
        mapCharOrder.put(order.charAt(i),i);
      }
      
      boolean existsSuchLength = true;
      String strPrevWord ;
      String strCurrWord = words[0];
      for( int indWord = 1 ; indWord < words.length ; indWord++ ){
        strPrevWord = strCurrWord;
        strCurrWord = words[indWord];
        if(!isSorted(mapCharOrder,strPrevWord,strCurrWord)) return false;
      }
      return true;
    }
  
    private boolean isSorted ( Map<Character, Integer> map, String w1, String w2 ){
      int indChar = 0;
      while( indChar < w1.length() && indChar < w2.length() && w1.charAt(indChar) == w2.charAt(indChar)) indChar++;
      if( indChar == w1.length()) return true;
      if( indChar == w2.length()) return false;
      return map.get(w1.charAt(indChar)) < map.get(w2.charAt(indChar));
    }
}
