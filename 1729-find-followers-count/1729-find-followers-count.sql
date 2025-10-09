# Write your MySQL query statement below
select user_id , distinct(COUNT(follower_id)) AS followers_count from followers 
GROUP BY follower_id
 order by user_id ASC;