/**
 * A string S of lowercase letters is given. We want to partition 
 * this string into as many parts as possible so that each letter 
 * appears in at most one part, 
 * return a list of integers representing the size of these parts.
 * https://leetcode.com/problems/partition-labels/
 * @Author EnMedina
 */

class Solution {
    public List<Integer> partitionLabels(String S) {
        int[][] occurr = new int[26][2];
        for( int i = 0 ; i < 26 ; i++ ){
            occurr[i][0] = -1;
            occurr[i][1] = -1;
        }

        for( int i = 0 ; i < S.length() ; i++ ){
            char currChar = S.charAt(i);
            if( occurr[currChar - 'a'][0] == -1){
                occurr[currChar - 'a'][0] = i;
                occurr[currChar - 'a'][1] = i;
            }else{
                occurr[currChar - 'a'][1] = i;
            }
        }

        List<Integer> stringLengths = new ArrayList<>();
        int currStartIndex = 0;

        while( currStartIndex < S.length() ){
            //Find where this string starts, minimum ending
            int minimumEnding = 0;
            boolean isSingleChar = false;
            for( int i = 0 ; i < 26 ; i++ ){
                if( occurr[i][0] == currStartIndex ){
                    minimumEnding = occurr[i][1];

                    break;
                }
            }

            for( int i = 0 ; i < 26 ; i++ ){
                if( occurr[i][0] > currStartIndex && occurr[i][0] < minimumEnding && occurr[i][1] > minimumEnding ){
                    minimumEnding = occurr[i][1];
                    i = 0;
                }
            }
            //System.out.println(S.substring(currStartIndex,minimumEnding+1));
            stringLengths.add(minimumEnding-currStartIndex+1);
            currStartIndex = minimumEnding+1;

        }
       return stringLengths;
    }
}


