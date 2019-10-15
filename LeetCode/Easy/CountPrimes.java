/**
 * https://leetcode.com/problems/count-primes/submissions/
 * Count the primes below n
 * @Author EnMedina
 */

class Solution {
    List<Integer> primes = new ArrayList<>();
    public int countPrimes(int n) {
        int[] sieve = new int[n];
        int nPrimes = 1 ;
        if( n <= 2) return 0; 
        for( int i = 3 ; i < n ; i+=2 ){
            if(sieve[i] == 0){
                nPrimes++;
                for( int j = i ; j < n ; j+=i){
                    sieve[j] = 1;
                }
            }
        }
        
        return nPrimes;
    }
    
       
}
