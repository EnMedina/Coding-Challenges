class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        String[] daysStrings = {"Friday","Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday"};
        int daysTranscurred = 0;
        for( int i = 1971 ; i < year ; i++ ){
            daysTranscurred += 365;
            if( i % 4 == 0 ) daysTranscurred++;
        }
        
        int[] monthsDays = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
        for( int i = 0 ; i < month-1 ; i++ ) {
        	daysTranscurred += monthsDays[i];
        }
        if( year %4 == 0 && month > 2) daysTranscurred++;
        
        daysTranscurred += day-1;
       // System.out.println("Days transcurred " + daysTranscurred );
        return daysStrings[daysTranscurred%7];
    }
}
