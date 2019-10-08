/**
 *  https://leetcode.com/problems/1-bit-and-2-bit-characters/submissions/
 *  REturn whether the last character of a string must be 1 bit
 *  @Author EnMedina
 */

class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        if(bits.length == 1) return true;
        if(bits[bits.length-2] == 0) return true;
        int indLastBit = bits.length-1;
        int pairIndex = 0;
        while( pairIndex < indLastBit ){
            if(bits[pairIndex] == 1) pairIndex++;
            pairIndex++;
        }
        return pairIndex == indLastBit;
    }
}
