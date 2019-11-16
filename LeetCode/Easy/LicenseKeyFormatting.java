/**
 * https://leetcode.com/problems/license-key-formatting/
 * Reformat a license key
 * @Author EnMedina
 */
class Solution {
  public String licenseKeyFormatting(String S, int K) {
    StringBuilder newKeySb = new StringBuilder();
    newKeySb.append(S.replace("-", "").toUpperCase());
    newKeySb.reverse();
    for( int i = K ; i < newKeySb.length() ; i+=K) {
      newKeySb.insert(i, '-');
      i++;
    }
    
    return newKeySb.reverse().toString();
}
}
