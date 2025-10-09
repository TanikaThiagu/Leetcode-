# Write your MySQL query statement below
select name from salesperson 
where sales_id NOT IN
(select o.sales_id from ORDERS o JOIN company c using(com_id)
where c.name = 'red') ;