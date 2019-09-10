/**
 * https://leetcode.com/problems/reverse-only-letters/
 * Return the reversed letters
 * @Author EnMedina
 */

public class ReverseLetters{
    public static void main(String[] args){
       System.out.println( reversedLetters ( "Hello world111" ) ); 
    }


    public String reverseOnlyLetters(String S) {
     StringBuilder sb = new StringBuilder(S);
          int left_pointer = 0;
          int right_pointer = sb.length() - 1;

          while( left_pointer < right_pointer ){
              while( left_pointer < S.length() && Character.isLetter(sb.charAt(left_pointer)) == false ) left_pointer++;
              while( right_pointer >= 0 && Character.isLetter(sb.charAt(right_pointer)) == false ) right_pointer--;

            if( left_pointer < right_pointer){
              char temp_char = sb.charAt(left_pointer);
              sb.setCharAt(left_pointer, sb.charAt( right_pointer ));
              sb.setCharAt( right_pointer, temp_char );
            }
           left_pointer++;
            right_pointer--;
      }
          return sb.toString();

    }
}
