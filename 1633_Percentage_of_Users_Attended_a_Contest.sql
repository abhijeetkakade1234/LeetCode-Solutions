# Write your MySQL query statement below

  
SELECT contest_id, 
round((count(contest_id) /(select count(user_id) from Users) * 100),2) as percentage
FROM Register 
GROUP BY contest_id 
ORDER BY percentage DESC, contest_id ASC;
