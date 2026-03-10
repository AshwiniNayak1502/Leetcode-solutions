# Write your MySQL query statement below
Select D.name As Department,E.name As Employee, E.salary As Salary
From Employee E
Join Department D on D.id=E.departmentId
where  
(Select Count(Distinct S.salary)
from Employee S
Where S.departmentId=E.departmentId
And S.salary>E.salary
)<3;
