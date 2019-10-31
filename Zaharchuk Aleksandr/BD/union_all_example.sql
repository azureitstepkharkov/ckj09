SELECT
  empl.FIRST_NAME as TITLE
 ,empl.salary as SALARY
  
FROM
HR.EMPLOYEES empl
union all
SELECT
jb.JOB_TITLE as Title
,jb.MAX_SALARY as SALARY
from
HR.JOBS jb