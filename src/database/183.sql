# Write your MySQL query statement below
select Name from Customers
left join
Orders on Customers.Id=CustomerId
where IsNull(Orders.Id)
