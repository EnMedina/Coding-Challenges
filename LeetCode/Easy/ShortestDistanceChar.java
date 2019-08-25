/**
 *  https://leetcode.com/problems/shortest-distance-to-a-character/submissions/
 *  Return the shortest Distance to occurrence of char
 *  @Author EnMedina
 */


//Initial hunch, was not that effective cause I'm iterating twice
class Solution {
	public int[] shortestToChar(String S, char C) {
		int[] distances = new int[S.length()];
		Arrays.fill(distances,1000);
		List<Integer> charOccurrences = new ArrayList<>();
		for( int i = 0 ; i < S.length() ; i++ ){
			if( S.charAt(i) == C ){
				charOccurrences.add(i);
			}
		}

		//Iterate from the left
		int prevOccurrence = -1;
		for( int occurrence : charOccurrences ){
			int distance = 0;
			while(occurrence-distance > prevOccurrence){
				distances[occurrence-distance] = distance;
				distance++;
			}
			prevOccurrence = occurrence;
		}
		//System.out.println(Arrays.toString(distances));

		//Iterate from the right

		prevOccurrence = S.length();
		for(int i = charOccurrences.size() -1; i >= 0 ; i-- ){
			int distance = 0;
			while(charOccurrences.get(i)+distance < prevOccurrence){
				distances[charOccurrences.get(i)+distance] = Math.min(distances[charOccurrences.get(i)+distance],distance);
				distance++;
			}
			prevOccurrence = charOccurrences.get(i);
		}
		return distances;
	}
}

// Second solution, only one pass
class Solution {
	public int[] shortestToChar(String S, char C) {
		List<Integer> charOccurrences = new ArrayList<>(); 
		for( int i = 0 ; i < S.length() ; i++ ){
			if( S.charAt(i) == C ) charOccurrences.add(i);
		}
		charOccurrences.add(100000);
		int[] distances = new int[S.length()];
		int occI = 0;
		int prevIndex = -1000000;
		int currIndex = charOccurrences.get(occI);
		for( int i = 0 ; i < distances.length ; i++ ){
			distances[i] = Math.min(i-prevIndex,currIndex-i);
			if( i == currIndex ){
				prevIndex = currIndex;
				currIndex = charOccurrences.get(++occI);
			}
		}
		return distances;
	}
}
