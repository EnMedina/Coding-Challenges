-- write a SQL query to output movies with an odd numbered ID 
-- and a description that is not 'boring'. Order the result by rating.

--My initial approach, beat 45%
SELECT *
FROM cinema
WHERE REMAINDER(id, 2) != 0
  AND description != 'boring'
ORDER BY rating DESC;
