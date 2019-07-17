package com.enriquemedina.codingchallenges.hackerrank.algorithms.implementation;

/**
 * Find the most amount of topics a pair can have
 * https://www.hackerrank.com/challenges/acm-icpc-team/problem
 * @author medin
 *
 */
public class AcmIcpcTeam {

	public static void main(String[] args) {
		String[] topics = new String[6];
		topics[0] = "10101";
		topics[1] = "11100";
		topics[2] = "11010";
		topics[3] = "00101";
		topics[4] = "10111";
		System.out.println(mySolution(topics);
	}
	
	static String mySolution(String[] topic) {
        int[] arrPairTopics = new int[topic[0].length()+1];
        
        // N of topics pairs will know
        for(int n1 = 0 ; n1 < topic.length ; n1++){
            for(int n2 = n1+1 ; n2 < topic.length ; n2++){
                int currTopics = 0;
                for(int i = 0 ; i < topic[0].length() ; i++){
                    if(topic[n1].charAt(i)=='1' || topic[n2].charAt(i)=='1'){
                        currTopics++;
                    }
                }
                arrPairTopics[currTopics]++;
            }
        }

        int maxNTopics = 0;
        int iMaxNTopics = 0;
        int i = arrPairTopics.length;
        while(i > 0){
            i--;
            if(arrPairTopics[i] != 0){
                maxNTopics = i;
                iMaxNTopics = arrPairTopics[i];
                break;
            }
        }

        return new int[]{maxNTopics,iMaxNTopics};
}
