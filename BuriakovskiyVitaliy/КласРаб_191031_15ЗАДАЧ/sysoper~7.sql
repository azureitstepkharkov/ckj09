--�������� ������ ����������� � ��������� �� �����, ���������, ���������� ����� � � ��������� ������, � ������� �� �������� ������ � ����� ����������������� ����������
SELECT 
    EMP.FIRST_NAME AS ���_�������
  , EMP.LAST_NAME AS �������_�������
  , EMP.SALARY AS ��
  , DPM.DEPARTMENT_NAME AS �������������
  , CNT.COUNTRY_NAME AS  ������
  , JBS.JOB_TITLE AS ���������
  , EMPM.FIRST_NAME AS ���_�������
  , EMPM.LAST_NAME AS �������_�������
FROM HR.EMPLOYEES EMP
LEFT JOIN HR.DEPARTMENTS DPM ON EMP.DEPARTMENT_ID = DPM.DEPARTMENT_ID
LEFT JOIN HR.LOCATIONS LTN ON DPM.LOCATION_ID = LTN.LOCATION_ID
LEFT JOIN HR.COUNTRIES CNT ON LTN.COUNTRY_ID = CNT.COUNTRY_ID
LEFT JOIN HR.JOBS JBS ON EMP.JOB_ID = JBS.JOB_ID
LEFT JOIN HR.EMPLOYEES EMPM ON EMP.MANAGER_ID =  EMPM.EMPLOYEE_ID
ORDER BY EMP.EMPLOYEE_ID