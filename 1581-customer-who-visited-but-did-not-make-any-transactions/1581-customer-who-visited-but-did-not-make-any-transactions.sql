# Write your MySQL query statement below
select customer_id ,count(visits.visit_id) AS count_no_trans from visits 
where visits.visit_id NOT IN (select visit_id from Transactions join visits
using(visit_id)  ) 
group by customer_id;