--
--  https://leetcode.com/problems/combine-two-tables/
--  Return the join of two tables
--  @Author EnMedina


SELECT t1.firstname, t1.lastname, t2.city, t2.state
FROM Person t1 LEFT JOIN Address t2
ON t1.personid = t2.personid;
