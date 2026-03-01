# Write your MySQL query statement below
Select query_name ,
Round(Avg(rating/position),2) As quality,
Round(Avg(rating<3)*100,2) As poor_query_percentage 
From Queries
Group By query_name  ;
