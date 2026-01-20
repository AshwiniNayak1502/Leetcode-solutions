# Write your MySQL query statement below
Select E.name As Employee
From Employee E, Employee M
Where E.managerId=M.id And E.salary>M.salary;
