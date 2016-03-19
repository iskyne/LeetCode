# Write your MySQL query statement below
select Max(Salary) from Employee
where Salary not in (Select Max(Salary) from Employee)