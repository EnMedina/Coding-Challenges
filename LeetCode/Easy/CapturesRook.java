/**
 *	https://leetcode.com/problems/available-captures-for-rook/submissions/
 *	Return the number of pawns a rook could captures
 *	@Author EnMedina
 */

class Solution {
    public int numRookCaptures(char[][] board) {
        int rookY = 0;
        int rookX = 0;
        
        //Find the rook first
        boolean foundRook = false;
        for(int y = 0 ; !foundRook &&  y < board.length ; y++ ){
            for( int x = 0 ; !foundRook && x < board[0].length ; x++){
                if( board[y][x] == 'R' ){
                    rookY = y;
                    rookX = x;
                    foundRook = true;
                }
            }
        }
        
        int possibleCaptures = 0;
        //Iterate x axis finding captures
        int moveIndex = rookX + 1;
        boolean foundBlock = false;
        while( moveIndex < board.length && !foundBlock ){
            if(board[rookY][moveIndex] != '.'){
                foundBlock = true;
                if(board[rookY][moveIndex] == 'p') possibleCaptures++;
            }
            moveIndex++;
        }
       
        moveIndex = rookX-1;
        foundBlock = false;
        while( moveIndex >= 0 && !foundBlock ){
            if(board[rookY][moveIndex] != '.'){
                foundBlock = true;
                if(board[rookY][moveIndex] == 'p') possibleCaptures++;
            }
            moveIndex--;
        }
        
        //Interate y axis finding captures
        moveIndex = rookY-1;
        foundBlock = false;
        while( moveIndex >= 0 && !foundBlock ){
            if(board[moveIndex][rookX] != '.'){
                foundBlock = true;
                if(board[moveIndex][rookX] == 'p') possibleCaptures++;
            }
            moveIndex--;
        }
        
        moveIndex = rookY+1;
        foundBlock = false;
        while( moveIndex < board.length && !foundBlock ){
            if(board[moveIndex][rookX] != '.'){
                foundBlock = true;
                if(board[moveIndex][rookX] == 'p') possibleCaptures++;
            }
            moveIndex++;
        }
        
        return possibleCaptures;
    }
}
