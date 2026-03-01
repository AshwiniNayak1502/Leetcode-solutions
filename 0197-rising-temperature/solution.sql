# Write your MySQL query statement below
Select W1.id
From Weather W1
Join Weather W2
On W1.temperature>W2.temperature
And DATEDIFF(W1.recordDate,w2.recordDate)=1 ;
