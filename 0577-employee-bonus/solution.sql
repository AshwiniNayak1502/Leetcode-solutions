# Write your MySQL query statement below
Select E.name, B.bonus 
From Employee E
Left Join Bonus B on E.empId=B.empId
where B.bonus<1000
Or  B.bonus Is NULL;
