-- ���������� ������� sum , count, avg, max ,min
-- ������ ���������
/*
1. ������� ������� �� ���-��� (�� ���� �����) ���� 
���� �� ������� ��������, �� �������� ������� �����, ������� ��� ����� �������
2. ��������� ������� ORDER BY
 � ���������� ������� ��� ��������� ������������� �����
 3. �������� ORDER BY �� GROUP BY (����������� ���������� ��������������)
  � �������� ���� � ���������
  */
  -- ������ 1 ����������� ����������� � ������
  
  SELECT 
  empl.EMPLOYEE_ID
  ,dep.DEPARTMENT_NAME
   lest join hr.departments dep on dep.DEPARTMENTS_ID
  =empl.DEPARTMENT_ID
  group by dep.DEPARTMENT_NAME
  order by 1
  
  -- ������ 2 ������� �� � ������
  -- ������ 3 ����������� �� � ������
  -- ������ 4 ������� �� ����� �� �� �����������
  -- ������ 5 ������� �� ����� �� �� �����������
  
--  SELECT empl.EMPLOYEE_ID
--  , dep.DEPARTMENT_NAME
--  form HR.EMPLOYEES empl lest join hr.departments dep on dep.DEPARTMENTS_ID
--  =empl.DEPARTMENT_ID
--  group by dep.DEPARTMENT_NAME
--  order by 1