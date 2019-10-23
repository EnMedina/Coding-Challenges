
class Solution {
    public List<String> readBinaryWatch(int num) {
      List<String> validTimes = new ArrayList<>();
      int[] leds = new int[10];
      for( int i = 0 ; i < 1024 ; i++ ) {
        if( validNumberLeds(leds,num) ) {
          String time = convertToTime(leds);
          if( !time.equals("")) validTimes.add(time);
        } 
        leds = add1(leds);
      }
      
      return validTimes;
    }
    
    private int[] add1( int[] nums ) {
      int currI = 0;
      while( currI < 10 && nums[currI] != 0 ) {
        nums[currI] = 0;
        currI++;
      }
      if(currI < 10) nums[currI] = 1;
      
      return nums;
    }
    
    private boolean validNumberLeds(int[] leds ,int num) {
      int count = 0;
      for( int led : leds ) if( led == 1) count++;
     if( count == num ){
        // System.out.println("Valid array " + Arrays.toString(leds));
         return true;
     } 
        return false;
    }
    
    private String convertToTime( int[] leds) {
      int hour = 0 ;
      int minutes = 0 ;
      for( int i = 0 ; i < 4 ; i++ ) if(leds[i] == 1) hour += (int)(Math.pow(2,i));
      for( int i = 4 ; i < leds.length ; i++ ) if( leds[i] == 1) minutes += (int)(Math.pow(2,i-4));
      //System.out.println( "hours : " + hour + " minutes : " + minutes );
      if( hour > 11 || minutes > 59 ) return "";
      String hourStr = hour+":";
      String minuteStr = (minutes < 10 ? "0" : "") + minutes;
      return hourStr+minuteStr;      
    }
}
