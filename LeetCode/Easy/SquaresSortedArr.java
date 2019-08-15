class Solution {
    public int[] sortedSquares(int[] A) {
      int[] B = new int[A.length];
      for(int i = 0 ; i < A.length ; i++){
        B[i] = A[i]*A[i];
      }
      Arrays.sort(B);
      return B;
    }
}

class BestSolution {
    public int[] sortedSquares(int[] A) {
      int pointerNeg = 0;
      int pointerPos = 0;
      int[] B = new int[A.length];
      while(pointerPos < A.length && A[pointerPos] < 0) pointerPos++;
      pointerNeg = pointerPos - 1;
      int currIndex = 0 ;
      while(currIndex < A.length ){
        //System.out.println("Originally pointing to " + A[pointerNeg] + " and " + A[pointerPos]);
        int negValue  = pointerNeg >= 0 ? Math.abs(A[pointerNeg]) : Integer.MAX_VALUE;
        int posValue  = pointerPos < A.length ? A[pointerPos] : Integer.MAX_VALUE;
        if( negValue < posValue ) pointerNeg--;
        else pointerPos++;
        B[currIndex++] = (int)Math.pow(Math.min(posValue,negValue),2);
      }
      return B;
    }
}
