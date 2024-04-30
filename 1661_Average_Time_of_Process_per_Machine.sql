
# Write your MySQL query statement below
SELECT StartAct.machine_id, round(avg(EndAct.timestamp - StartAct.timestamp), 3) AS processing_time
FROM Activity StartAct JOIN Activity EndAct 
ON StartAct.machine_id = EndAct.machine_id 
AND StartAct.process_id = EndAct.process_id
WHERE StartAct.activity_type ='start'
AND EndAct.activity_type='end'
GROUP BY StartAct.machine_id
