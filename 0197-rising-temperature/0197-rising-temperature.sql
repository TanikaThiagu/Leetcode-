# Write your MySQL query statement below
select a.id  from weather a join weather b on DATE_SUB(a.recordDate, INTERVAL 1 DAY) = b.recordDate
where a.temperature > b.temperature ;