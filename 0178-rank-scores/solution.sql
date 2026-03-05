# Write your MySQL query statement below
Select s1.score,
(Select Count(Distinct s2.score)
From Scores s2
Where s2.score>s1.score) + 1 As `rank`
From Scores s1
Order By S1.score Desc;

