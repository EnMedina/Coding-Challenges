class Solution {
  public int numEquivDominoPairs(int[][] dominoes) {
      Map<Integer,Integer> freqMap = new HashMap<>();
      for( int[] domino : dominoes ) {
        int lowerNum = Math.min(domino[0], domino[1]);
        int upperNum = Math.max(domino[0], domino[1]);
        int currNum  = (lowerNum*10) + upperNum;
        int numOcc = freqMap.containsKey(currNum) ? freqMap.get(currNum) : 0;
        numOcc++;
        freqMap.put(currNum,numOcc);        
      }
      int pairs = 0;
      
      for(int value : freqMap.keySet() ) {
        int currOcc = freqMap.get(value);
        if( currOcc == 1) continue;
        int possiblePairs = 0;
        for(int i = 1; i < currOcc ; i++ )possiblePairs+=i;
        pairs += possiblePairs;
      }
      return pairs;
      
  }
}
