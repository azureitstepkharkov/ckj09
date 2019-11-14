--Выведите список сотрудников с указанием их имени, должности, заработной платы и с указанием отдела, в котором он работает сейчас и имени непосредственного начальника
SELECT 
    EMP.FIRST_NAME AS ИМЯ_СОТРУДН
  , EMP.LAST_NAME AS ФАМИЛИЯ_СОТРУДН
  , EMP.SALARY AS ЗП
  , DPM.DEPARTMENT_NAME AS ПОДРАЗДЕЛЕНИЕ
  , CNT.COUNTRY_NAME AS  СТРАНА
  , JBS.JOB_TITLE AS ДОЛЖНОСТЬ
  , EMPM.FIRST_NAME AS ИМЯ_НАЧАЛЬН
  , EMPM.LAST_NAME AS ФАМИЛИЯ_НАЧАЛЬН
FROM HR.EMPLOYEES EMP
LEFT JOIN HR.DEPARTMENTS DPM ON EMP.DEPARTMENT_ID = DPM.DEPARTMENT_ID
LEFT JOIN HR.LOCATIONS LTN ON DPM.LOCATION_ID = LTN.LOCATION_ID
LEFT JOIN HR.COUNTRIES CNT ON LTN.COUNTRY_ID = CNT.COUNTRY_ID
LEFT JOIN HR.JOBS JBS ON EMP.JOB_ID = JBS.JOB_ID
LEFT JOIN HR.EMPLOYEES EMPM ON EMP.MANAGER_ID =  EMPM.EMPLOYEE_ID
ORDER BY EMP.EMPLOYEE_ID