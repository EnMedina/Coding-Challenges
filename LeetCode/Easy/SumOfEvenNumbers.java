/**
 *  https://leetcode.com/problems/sum-of-even-numbers-after-queries/submissions/
 *  Return the sum of even numbers after every query
 *  @Author EnMEdina
 **/


class Solution {
    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int sumOfEven = 0;
        
        for(int number : A){if(number%2 == 0) sumOfEven+=number;}
       // System.out.println("Initial SumOfEven is " + sumOfEven);
        
        int[] answers = new int[queries.length];
        int answersI = 0;
        for( int[] query : queries ){
            if( A[query[1]] % 2 == 0 ){
                if(query[0] % 2 == 0){
                    sumOfEven += query[0];
                }else{
                    sumOfEven -= A[query[1]];
                }
            }else{
                
                if( query[0] % 2 != 0){
                    sumOfEven += query[0] + A[query[1]];
                }
            }
            
            answers[answersI++] = sumOfEven;
            A[query[1]] += query[0];
            
            //System.out.println(Arrays.toString(A));
        }
        
        return answers;
        
    }
}
