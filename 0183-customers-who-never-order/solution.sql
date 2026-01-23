# Write your MySQL query statement below
Select C.name as Customers
From Customers C
Where C.id NOT IN
(Select customerId 
From Orders);
