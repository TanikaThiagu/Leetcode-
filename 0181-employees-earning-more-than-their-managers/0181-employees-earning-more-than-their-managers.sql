# Write your MySQL query statement below
select name AS Employee from employee E where managerId IS NOT NULL and salary > (select salary from employee where id = E.managerId) ;
