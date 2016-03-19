# Write your MySQL query statement below
delete from Person where Id not in
(select * from(select min(Id) from Person
Group by Email) t)