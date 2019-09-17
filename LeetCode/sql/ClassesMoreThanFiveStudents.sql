/**
list out all classes which have more than or equal to 5 students.

+---------+------------+
| student | class      |
+---------+------------+
| A       | Math       |
| B       | English    |
| C       | Math       |
| D       | Biology    |
| E       | Math       |
| F       | Computer   |
| G       | Math       |
| H       | Math       |
| I       | Math       |
+---------+------------+
*/

--Initial approach, beat 70%
SELECT class
FROM (
    SELECT sq2.class as class, count(*) as count
    FROM ( SELECT DISTINCT student, class FROM courses) sq2
    GROUP BY sq2.class
) sq1
WHERE sq1.count > 4;

-- This is more elegant but it has the same runtime
select class from courses group by class having count(distinct student) >= 5;
