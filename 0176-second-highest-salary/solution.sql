# Write your MySQL query statement below
Select (
Select Distinct salary 
From Employee
Order By salary desc
Limit 1 Offset 1)
As SecondHighestSalary ;
