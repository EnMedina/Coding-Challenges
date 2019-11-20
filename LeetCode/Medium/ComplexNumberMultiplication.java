
/**
 * https://leetcode.com/problems/complex-number-multiplication/
 * Return a complex number result
 * @Author EnMedina
 */

//Input: "1+1i", "1+1i"  i^2 = 1
//Output: "0+2i"

class Solution {
  public String complexNumberMultiply(String a, String b) {
      String[] aArray = a.split("\\+");
      String[] bArray = b.split("\\+");
      
      aArray[1] = aArray[1].substring(0, aArray[1].length()-1);
      bArray[1] = bArray[1].substring(0, bArray[1].length()-1);
      
      //System.out.println( "Array A : " + Arrays.toString(aArray));
      //System.out.println( "Array B : " + Arrays.toString(bArray));
      
      int aReal = Integer.parseInt(aArray[0]);
      int aImag = Integer.parseInt(aArray[1]);
      
      int bReal = Integer.parseInt(bArray[0]);
      int bImag = Integer.parseInt(bArray[1]);
      
      //System.out.println( "Int A : " + aReal + ", " + aImag);
      //System.out.println( "Int B : " + bReal + ", " + bImag);
      
      int cReal = (aReal*bReal)+((aImag*bImag) * -1);
      int cImag = (aReal*bImag)+(bReal*aImag);
      
      return "" + cReal + "+" + cImag +"i";
      
  }
}
