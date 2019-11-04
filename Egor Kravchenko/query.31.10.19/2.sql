SELECT HR.DEPARTMENTS.DEPARTMENT_NAME
FROM HR.DEPARTMENTS
LEFT JOIN HR.EMPLOYEES ON HR.DEPARTMENTS.DEPARTMENT_ID = HR.EMPLOYEES.DEPARTMENT_ID
WHERE HR.EMPLOYEES.SALARY > 12000;