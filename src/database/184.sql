# Write your MySQL query statement below
select Department.Name as Department,
		Employee.Name as Employee,
		Employee.Salary as Salary
from Employee
inner join
(Select max(Salary) as Salary,DepartmentId
from Employee
group by Employee.DepartmentId) temp
on Employee.Salary=temp.Salary
and Employee.DepartmentId=temp.DepartmentId
inner join
Department
on Department.Id=temp.DepartmentId
