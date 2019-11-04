--(���.)������� ������ �����������, ������� �� ���������� ������ � ����������� ������������ ����� ��������.
SELECT 
EMP.EMPLOYEE_ID,
  EMP.FIRST_NAME,
  EMP.LAST_NAME,
  EMP.EMAIL,
  EMP.PHONE_NUMBER,
  EMP.HIRE_DATE,
  EMP.JOB_ID,
  EMP.SALARY,
  EMP.COMMISSION_PCT,
  EMP.MANAGER_ID,
  EMP.DEPARTMENT_ID,
JBH.DEPARTMENT_ID
FROM HR.EMPLOYEES EMP
LEFT JOIN HR.DEPARTMENTS DPT ON DPT.DEPARTMENT_ID=EMP.DEPARTMENT_ID
left JOIN HR.JOB_HISTORY JBH ON JBH.EMPLOYEE_ID=EMP.EMPLOYEE_ID

WHERE   EMP.DEPARTMENT_ID<>JBH.DEPARTMENT_ID