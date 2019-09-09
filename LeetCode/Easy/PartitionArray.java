/**
 *  https://leetcode.com/problems/partition-array-into-three-parts-with-equal-sum/
 *  Partition the array in three equal parts if possible
 *  @Author EnMedina
 */

public class PartitionArray{
    public static void main(String[] args){
        System.out.println(canPartitionArray(new int[] { 3,3,6,5,-2,2,5,1,-9,4}));
    }

    private static boolean canPartitionArray( int[] A ){
        int arrSum = 0;
        for( int num : A ) arrSum += num;
        if( arrSum % 3 != 0 ) return false;
        int currSum = 0;
        int timesFound = 0;
        for( int i = 0 ; i < A.length ; i++ ){
            currSum += A[i];
            if(currSum == arrSum/3){
                currSum = 0;
                timesFound++;
            }
        }

        return timesFound == 3 && currSum == 0;
    }
}

