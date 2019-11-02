/**
 * https://leetcode.com/problems/largest-time-for-given-digits/submissions/
 * Return the largest possible time to be made from a 4 digit array
 * @Author ENMedina
 */


class Solution {
    public String largestTimeFromDigits(int[] A) {
       int largestTime = -1;
       for( int i = 0 ; i < 4 ; i++ ){
           for( int j = 0 ; j < 4 ; j++ ){
               if( j != i ){
                   for( int k = 0 ; k < 4 ; k++ ){
                       if( k != i && k != j ){
                          int  l = 6 - i-j-k;
                           if(validHour(A[i],A[j]) && validMinute(A[k],A[l])) largestTime = Math.max(largestTime, (A[i]*1000)+(A[j]*100)+(A[k]*10)+(A[l]));
                       }
                   }
               }
           }
       } 
     if( largestTime == -1) return "";
     String answer = largestTime/100 < 10 ? "0"+largestTime/100 : ""+largestTime/100;
     answer += largestTime%100 < 10 ? ":0"+largestTime%100 : ":"+largestTime%100;
     return answer;
    }
    
    public boolean validHour( int a, int b){
        return (a*10)+b < 24;
    }
    
    public boolean validMinute( int a, int b){
        return (a*10)+b < 60;
    }
}
