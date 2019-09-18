/**
Write a SQL query to get the second highest salary from the Employee table.

+----+--------+
| Id | Salary |
+----+--------+
| 1  | 100    |
| 2  | 200    |
| 3  | 300    |
+----+--------+
*/

--This was my initial approach, did not take null into consideration though
SELECT sq1.salary as secondhighestSalary
FROM  ( SELECT rownum as rn, salary FROM employee ORDER BY salary DESC) sq1
WHERE sq1.rn = 2;

-- The max function returns NULL if nothing is found
SELECT max(Salary) AS secondhighestsalary
FROM Employee
WHERE Salary < (SELECT max(Salary) FROM Employee)


--Cam be used for nth highest
select (select distinct salary
        from Employee
        order by salary DESC
        limit 1 offset 1)
as SecondHighestSalary;
