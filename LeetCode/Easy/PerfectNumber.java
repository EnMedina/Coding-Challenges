/**
 * https://leetcode.com/problems/perfect-number/
 * Return whether a number is equal to the sum of its divisors
 * @Author EnMedina
 * /

class Solution {
    public boolean checkPerfectNumber(int num) {
        if( num <= 1 ) return false;
        int perfNum = 1;
        for( int i = 2 ; i <= (int)Math.sqrt(num) ; i++  ){
            if( num%i == 0 ){
                perfNum+= i;
                if( i*i != num ) perfNum += num/i;
            }
        }
        //System.out.println("PerfNum is : " + perfNum); 
        return perfNum == num;
    }
}
