/**
 *  https://leetcode.com/problems/employee-importance/submissions/
 *  Return the importance of an employee
 *  @Author EnMedina
 */

/*
// Employee info
class Employee {
    // It's the unique id of each node;
    // unique id of this employee
    public int id;
    // the importance value of this employee
    public int importance;
    // the id of direct subordinates
    public List<Integer> subordinates;
};
*/
class Solution {
    public int getImportance(List<Employee> employees, int id) {
      Map<Integer,Employee> mapEmployees = new HashMap<>();
      for( Employee e : employees){
        mapEmployees.put(e.id,e);
      }
      
      
      Deque<Integer> stack = new LinkedList<>();
      stack.add(id);
      int totalImportance = 0;
      while(!stack.isEmpty()){
        int currId = stack.remove();
        totalImportance += mapEmployees.get(currId).importance;
        for( Integer i : mapEmployees.get(currId).subordinates){
          stack.add(i);
        }
      }
      return totalImportance;
      
    }
}
