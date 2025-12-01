# Write your MySQL query statement below
select  * from cinema where id%2 != 0 
and description NOT like 'borning'
order by rating desc ;