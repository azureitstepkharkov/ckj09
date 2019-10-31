--Выведите список сотрудников, чьи телефонные номера начинаются с 590 и заканчиваются на 0
SELECT 
EMPLOYEE_ID,
  FIRST_NAME,
  LAST_NAME,
  EMAIL,
  PHONE_NUMBER,
  HIRE_DATE,
  JOB_ID,
  SALARY,
  COMMISSION_PCT,
  MANAGER_ID,
  DEPARTMENT_ID
FROM HR.EMPLOYEES EMP
WHERE PHONE_NUMBER LIKE '590%0'