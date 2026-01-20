# Write your MySQL query statement below
Select P.firstName,p.lastName,A.city,A.state
From Person P
Left Join Address A on A.personId=P.personId;
