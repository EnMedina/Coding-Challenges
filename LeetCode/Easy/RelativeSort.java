
/*
 * https://leetcode.com/problems/relative-sort-array/submissions/
 * Relativer sort of an array 
 */ @Author EnMedina

class Solution {
	public int[] relativeSortArray(int[] arr1, int[] arr2) {
		int[] arr3 = new int[arr1.length];
		HashSet<Integer> arr2Elements = new HashSet<>();
		for(int i : arr2) arr2Elements.add(i);



		int endI = arr1.length - 1;
		Map<Integer,Integer> occurrences = new HashMap<>();
		for( int element : arr1 ){
			if(arr2Elements.contains(element)){
				if(occurrences.keySet().contains(element)){
					occurrences.put(element,occurrences.get(element)+1);
				}
				else{
					occurrences.put(element,1);
				}
			}else{
				if(!arr2Elements.contains(element)){
					arr3[endI--] = element;
				}
			}
		} 
		Arrays.sort(arr3, endI+1, arr3.length);
		// Now we inser the number of ocurrences as they appear
		int startI = 0;
		for(int element : arr2){
			int elementOccurrences = occurrences.get(element);
			for(int i = 0 ; i < elementOccurrences ; i++){
				arr3[startI++] = element;
			}
		}

		return arr3;
	}
} 
