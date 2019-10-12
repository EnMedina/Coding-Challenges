/*

+---------------+---------+
| Column Name   | Type    |
+---------------+---------+
| id            | int     |
| revenue       | int     |
| month         | varchar |
+---------------+---------+

turn this into this 

Result table:
+------+-------------+-------------+-------------+-----+-------------+
| id   | Jan_Revenue | Feb_Revenue | Mar_Revenue | ... | Dec_Revenue |
+------+-------------+-------------+-------------+-----+-------------+
| 1    | 8000        | 7000        | 6000        | ... | null        |
| 2    | 9000        | null        | null        | ... | null        |
| 3    | null        | 10000       | null        | ... | null        |
+------+-------------+-------------+-------------+-----+-------------+

Note that the result table has 13 columns (1 for the department id + 12 for the months).
*/

WITH d AS (SELECT DISTINCT id FROM department)
SELECT d.id , 
(    SELECT SUM(revenue) FROM department WHERE id = d.id AND month = 'Jan' ) AS Jan_Revenue,
(    SELECT SUM(revenue) FROM department WHERE id = d.id AND month = 'Feb' ) AS Feb_Revenue,
(    SELECT SUM(revenue) FROM department WHERE id = d.id AND month = 'Mar' ) AS Mar_Revenue,
(    SELECT SUM(revenue) FROM department WHERE id = d.id AND month = 'Apr' ) AS Apr_Revenue,
(    SELECT SUM(revenue) FROM department WHERE id = d.id AND month = 'May' ) AS May_Revenue,
(    SELECT SUM(revenue) FROM department WHERE id = d.id AND month = 'Jun' ) AS Jun_Revenue,
(    SELECT SUM(revenue) FROM department WHERE id = d.id AND month = 'Jul' ) AS Jul_Revenue,
(    SELECT SUM(revenue) FROM department WHERE id = d.id AND month = 'Aug' ) AS Aug_Revenue,
(    SELECT SUM(revenue) FROM department WHERE id = d.id AND month = 'Sep' ) AS Sep_Revenue,
(    SELECT SUM(revenue) FROM department WHERE id = d.id AND month = 'Oct' ) AS Oct_Revenue,
(    SELECT SUM(revenue) FROM department WHERE id = d.id AND month = 'Nov' ) AS Nov_Revenue,
(    SELECT SUM(revenue) FROM department WHERE id = d.id AND month = 'Dec' ) AS Dec_Revenue
FROM d;
