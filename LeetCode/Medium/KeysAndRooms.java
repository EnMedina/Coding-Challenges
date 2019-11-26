
/**
 * https://leetcode.com/problems/keys-and-rooms/
 * Return whether all rooms can be opened
 * @Author EnMedina
 */
class Solution {
  public boolean canVisitAllRooms(List<List<Integer>> rooms) {
      Set<Integer> seen = new HashSet<>();
      Deque<Integer> queue = new LinkedList<>();
      queue.add(0);
      seen.add(0);
      while( ! queue.isEmpty() ) {
        List<Integer> currRoomList = rooms.get(queue.pop());
        for( int key : currRoomList ) {
          if( !seen.contains(key) ) {
            queue.add(key);
            seen.add(key);
          }
        }
      }
      return seen.size() == rooms.size();
  }
}
