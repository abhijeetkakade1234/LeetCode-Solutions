# 1378. Replace Employee ID With The Unique Identifier

SELECT EmployeeUNI.unique_id as unique_id, Employees.name as name FROM Employees 
left join EmployeeUNI on Employees.id = EmployeeUNI.id;
