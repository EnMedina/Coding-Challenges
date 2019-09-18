/**
Write a SQL query to delete all duplicate email entries in a table named Person, keeping only unique emails based on its smallest Id.

+----+------------------+
| Id | Email            |
+----+------------------+
| 1  | john@example.com |
| 2  | bob@example.com  |
| 3  | john@example.com |
+----+------------------+

*/

DELETE p1
FROM person p1, person p2
WHERE p1.email = p2.email
AND p1.id > p2.id;


# Write your MySQL query statement below
DELETE p1
FROM person p1 JOIN person p2
ON p1.email = p2.email
WHERE p1.id > p2.id
