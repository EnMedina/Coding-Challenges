/**
    Return the customers that haven't ordered anything

Table: Customers.
+----+-------+
| Id | Name  |
+----+-------+
| 1  | Joe   |
| 2  | Henry |
| 3  | Sam   |
| 4  | Max   |
+----+-------+
Table: Orders.
+----+------------+
| Id | CustomerId |
+----+------------+
| 1  | 3          |
| 2  | 1          |
+----+------------+
*/

-- Initial approach , beating around 30% but most upvoted
SELECT customers.name AS Customers
FROM customers LEFT JOIN orders
ON customers.id = orders.customerid
WHERE orders.id IS NULL;


--Second approach, pretty much same run time
SELECT customers.name as Customers
FROM customers
WHERE customers.id NOT IN ( SELECT customerid FROM orders);
