/**
 * https://leetcode.com/problems/stone-game/
 * Return whether player 1 will win a game of stones
 * @Author EnMedina
 */
class Solution {
  public boolean stoneGame(int[] piles) {
    // At any given point you want to take the one that will give your opponent the least advantage
    int pointerStart = 0;
    int pointerEnd   = piles.length-1;
    
    int play1Points = 0;
    int play2Points = 0;
    int turn = 1;
    
    while( turn <= piles.length ) {
      int startIncrease = pointerStart == piles.length-1 ? Integer.MIN_VALUE : piles[pointerStart+1] - piles[pointerStart]; 
      int endIncrease   = pointerEnd   == 0 ?              Integer.MIN_VALUE : piles[pointerEnd-1] - piles[pointerEnd];
      //System.out.println("Start increase " + startIncrease + ", End increase " + endIncrease);
      if( startIncrease > endIncrease ) {
        if( turn % 2 == 0 ) play2Points += piles[pointerEnd];
        else play1Points += piles[pointerEnd];
        pointerEnd--;
      }else {
        if( turn % 2 == 0 ) play2Points += piles[pointerStart];
        else play1Points += piles[pointerStart];
        pointerStart++;
      }
      //System.out.println("PointerStart " + pointerStart + ", PointerEnd "+ pointerEnd);
      turn++;
    }
    //System.out.println("Player 1 points : " + play1Points + " , Player 2 points : " + play2Points);
    return play1Points > play2Points;
  }
}
