/**
 *  https://leetcode.com/problems/first-bad-version/submissions/
 *  Return the number of the first bad version
 *  @Author EnMedina
 */

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        long lowerBoundary = 1;
        long upperBoundary = n;
        int binaryPos = n/2;
        boolean currCall = isBadVersion((int)binaryPos);
        while( currCall == isBadVersion((int)(binaryPos+1)) ){
            if( currCall == false ){
                lowerBoundary = binaryPos+1;
            }else{
                upperBoundary = binaryPos-1;
            }
            binaryPos =(int) ((lowerBoundary+upperBoundary) /2);
            currCall = isBadVersion(binaryPos);
            //System.out.println("Binary pos is now " + binaryPos);
        }
        return binaryPos + 1;
    }
}
