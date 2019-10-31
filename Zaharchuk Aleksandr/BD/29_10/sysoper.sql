SELECT empl.EMPLOYEE_ID
  , dep.DEPARTMENT_NAME
  form HR.EMPLOYEES empl lest join hr.departments dep on dep.DEPARTMENTS_ID
  =empl.DEPARTMENT_ID
  group by dep.DEPARTMENT_NAME
  order by 1