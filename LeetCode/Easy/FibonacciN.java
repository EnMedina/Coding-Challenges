
/*
 * https://leetcode.com/problems/fibonacci-number/submissions/
 * Generate Fibonacci Sequence  
*/ @Author EnMedina
class Solution {
    public int fib(int N) {
        int f1 = 0;
        int f2 = 1;
        while(N > 0){
            N--;
            int temp = f2 + f1;
            f1 = f2 ;
            f2 = temp;
        }
        return f1;
    }
}
