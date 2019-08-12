--My Original Solution 715ms
SELECT name,population, area
FROM world
WHERE area > 3000000
    OR population > 25000000;

--In theory Union should be faster but its not
--Strictly speaking, Using UNION is faster when it comes to cases like scan two different column like this.
--Second solution 980ms
SELECT name,population, area
FROM world
WHERE area > 3000000
union
SELECT name,population, area
FROM world
WHERE population > 25000000;
