/**
 * Return an ordering of the deck that would reveal the cards in increasing order. 
 * https://leetcode.com/problems/reveal-cards-in-increasing-order/
 * @Author EnMedina
 * /

class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        int[] shuffle = new int[deck.length];
        for( int i = 0 ; i < shuffle.length ; i++ ) shuffle[i] = -1;
        int currCardI = 1;
        shuffle[0] = deck[0];
        int i = 0;
        while( currCardI < deck.length ){
            int countEmpty = 0;
            while( countEmpty < 2 ){
                i++;
                if( i >= shuffle.length ) i = 0;
                if( shuffle[i] == -1 ) countEmpty++; 
            }
            shuffle[i] = deck[currCardI];
            currCardI++;
        }
        return shuffle;
    }
}
