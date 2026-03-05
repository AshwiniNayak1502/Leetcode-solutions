# Write your MySQL query statement below
Select Distinct L1.num As ConsecutiveNums 
From Logs L1
Join Logs L2 on L1.id=L2.id-1
Join Logs L3 on L1.id=L3.id-2
where L1.num=L2.num
And L2.num=L3.num;

