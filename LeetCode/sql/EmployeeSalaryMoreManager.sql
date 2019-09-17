/**
    Return Employees making more than their managers
+----+-------+--------+-----------+
| Id | Name  | Salary | ManagerId |
+----+-------+--------+-----------+
| 1  | Joe   | 70000  | 3         |
| 2  | Henry | 80000  | 4         |
| 3  | Sam   | 60000  | NULL      |
| 4  | Max   | 90000  | NULL      |
+----+-------+--------+-----------+
*/
--Initial approach, 1446 ms
SELECT e2.name as Employee
FROM employee e1, employee e2
WHERE e2.salary > e1.salary
AND e2.managerid = e1.id;
--
--Second approach, 2305 ms, 630 ms
select e.Name as Employee
from Employee e, Employee m
where e.ManagerId is not NULL and
e.ManagerId = m.ID and e.Salary > m.Salary

--Third approach, 1300 ms, 796 ms --Probably best approach
SELECT e1.name as Employee
FROM employee e1 INNER JOIN employee e2
ON e1.managerid = e2.id
WHERE e1.salary > e2.salary;
