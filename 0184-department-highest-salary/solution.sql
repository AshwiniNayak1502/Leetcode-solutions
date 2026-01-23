# Write your MySQL query statement below
Select D.name As Department, E.name As Employee,E.Salary
From Employee E
Join Department D on D.id=E.departmentId
Where E.salary=
(Select Max(salary)
From Employee E
Where E.departmentId=D.id
)
