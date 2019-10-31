--1. ?????? ??????????, ?? ??????? ?????????? ????? ????? 12000
SELECT DISTINCT j.JOB_TITLE
FROM HR.JOBS j LEFT JOIN HR.EMPLOYEES e ON j.JOB_ID = e.JOB_ID
WHERE e.SALARY < 12000;
--2. ?????? ???????, ? ??????? ???????? ??????????, ?? ??????????, ? ??????? ????? 12000
SELECT DISTINCT j.JOB_TITLE
FROM HR.JOBS j LEFT JOIN HR.EMPLOYEES e ON j.JOB_ID = e.JOB_ID
WHERE e.SALARY > 12000;

--3. ???????? ?????? ??????????? ? ????????? ?? ?????, ?????????, ?????????? ????? ? ? ????????? ??????, ? ??????? ?? ???????? ??????
SELECT e.FIRST_NAME, e.LAST_NAME, e.SALARY, j.JOB_TITLE, d.DEPARTMENT_NAME, e2.FIRST_NAME MANAGER_FIRST_NAME, e2.LAST_NAME MANAGER_LAST_NAME
FROM HR.EMPLOYEES e left join HR.JOBS j ON e.JOB_ID = j.JOB_ID
LEFT JOIN HR.DEPARTMENTS d on e.DEPARTMENT_ID = d.DEPARTMENT_ID
LEFT JOIN HR.EMPLOYEES e2 ON e.MANAGER_ID = e2.EMPLOYEE_ID
WHERE e.EMPLOYEE_ID not in (SELECT EMPLOYEE_ID FROM HR.JOB_HISTORY);


--4. ???????? ?????? ???????????, ??? ?????????? ?????? ????????????? ?? 9
SELECT 
FIRST_NAME ,
LAST_NAME ,
PHONE_NUMBER 
FROM HR.EMPLOYEES e
WHERE e.PHONE_NUMBER LIKE '%9';

--5. ???????? ?????? ???????????, ??? ?????????? ?????? ?????????? ? 590 ? ????????????? ?? 0
/*
SELECT 
FIRST_NAME ,
LAST_NAME ,
PHONE_NUMBER 
FROM HR.EMPLOYEES e
WHERE e.PHONE_NUMBER LIKE '590%0';
*/
--6. ???????? ?????? ?????????? ? ???????? ???????, ???????? ??? ?????????
SELECT d.DEPARTMENT_NAME, e2.FIRST_NAME, e2.LAST_NAME
FROM HR.DEPARTMENTS d LEFT JOIN 
HR.EMPLOYEES e2 on d.MANAGER_ID = e2.EMPLOYEE_ID
WHERE e2.FIRST_NAME is NOT NULL;
--7. ???????? ?????? ??????????? ? ????????? ?? ?????, ?????????, ?????????? ????? ? ? ????????? ??????, ? ??????? ?? ???????? ?????? ? ????? ????????????????? ??????????
SELECT e.FIRST_NAME, e.LAST_NAME, e.SALARY, j.JOB_TITLE, d.DEPARTMENT_NAME, e2.FIRST_NAME MANAGER_FIRST_NAME, e2.LAST_NAME MANAGER_LAST_NAME
FROM HR.EMPLOYEES e left join HR.JOBS j ON e.JOB_ID = j.JOB_ID
LEFT JOIN HR.DEPARTMENTS d on e.DEPARTMENT_ID = d.DEPARTMENT_ID
LEFT JOIN HR.EMPLOYEES e2 ON e.MANAGER_ID = e2.EMPLOYEE_ID
WHERE e.EMPLOYEE_ID not in (SELECT EMPLOYEE_ID FROM HR.JOB_HISTORY);

--8. ????????? ??????? ?????????? ????? ?????????
SELECT DISTINCT AVG(e2.SALARY) AVG_MANAGER_SALARY FROM HR.EMPLOYEES e LEFT JOIN HR.EMPLOYEES e2 ON e.MANAGER_ID = e2.EMPLOYEE_ID
WHERE
e2.FIRST_NAME IS NOT NULL;
--9. ???????? ?????? ??????? ? ?????????? ??????????? ?????? ?? ???????
SELECT d.DEPARTMENT_NAME, COUNT(e.EMPLOYEE_ID) EMPL_NUM 
FROM HR.DEPARTMENTS d LEFT JOIN HR.EMPLOYEES e ON d.DEPARTMENT_ID = e.DEPARTMENT_ID
GROUP BY d.DEPARTMENT_NAME;
--10. ???????? ?????? ??????? ? ??????? ?????????? ????? ? ???
SELECT d.DEPARTMENT_NAME, AVG(e.SALARY) AVG_SELARY
FROM HR.DEPARTMENTS d LEFT JOIN HR.EMPLOYEES e ON d.DEPARTMENT_ID = e.DEPARTMENT_ID
GROUP BY d.DEPARTMENT_NAME;

--11. ???????? ?????? ??????? ? ????????? ?????? ??????? ?? ?????? ????? ??? ???????????
SELECT d.DEPARTMENT_NAME, SUM(e.SALARY) AVG_SELARY
FROM HR.DEPARTMENTS d LEFT JOIN HR.EMPLOYEES e ON d.DEPARTMENT_ID = e.DEPARTMENT_ID
GROUP BY d.DEPARTMENT_NAME;

--12. ?????????? ???? ?? ??????, ? ??????? ???????? ??????????, ??????????????? ???????????? ??????
SELECT DISTINCT e.FIRST_NAME, e.LAST_NAME, e2.FIRST_NAME, e2.LAST_NAME FROM HR.EMPLOYEES e LEFT JOIN HR.EMPLOYEES e2 ON e.MANAGER_ID = e2.EMPLOYEE_ID
WHERE
e2.FIRST_NAME IS NULL;

