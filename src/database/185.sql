# Write your MySQL query statement below
select distinct Department.Name as Department,
		Employee.Name as Employee,
		Employee.Salary as Salary
from Employee
inner join
(Select Salary as Salary,DepartmentId
from Employee a
where (select count(*)
	from (select distinct Salary,DepartmentId from Employee ) b
	where  b.DepartmentId=a.DepartmentId 
	and a.Salary<b.Salary)<3
order by a.DepartmentId desc) temp
on Employee.Salary=temp.Salary
and Employee.DepartmentId=temp.DepartmentId
inner join
Department
on Department.Id=temp.DepartmentId