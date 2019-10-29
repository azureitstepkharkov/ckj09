-- агрегатные функции sum , count, avg, max ,min
-- логика создангия
/*
1. создаем выборку на два-три (до пяти полей) поля 
одно из которых числовое, по которомы находим сумму, среднее или ведем подсчет
2. добавляем строчку ORDER BY
 в результате которой все слогаемые выстраиваются рядом
 3. заменяем ORDER BY на GROUP BY (сворачиваем одинаковые характеристики)
  и помещаем поле в агрегатор
  */
  -- пример 1 колличество сторудников в отделе
  
  SELECT 
  empl.EMPLOYEE_ID
  ,dep.DEPARTMENT_NAME
   lest join hr.departments dep on dep.DEPARTMENTS_ID
  =empl.DEPARTMENT_ID
  group by dep.DEPARTMENT_NAME
  order by 1
  
  -- пример 2 средняя зп в отделе
  -- пример 3 минимальная ЗП в отделе
  -- пример 4 затраты на отдел по зп фактические
  -- пример 5 затраты на отдел по зп планируемые
  
--  SELECT empl.EMPLOYEE_ID
--  , dep.DEPARTMENT_NAME
--  form HR.EMPLOYEES empl lest join hr.departments dep on dep.DEPARTMENTS_ID
--  =empl.DEPARTMENT_ID
--  group by dep.DEPARTMENT_NAME
--  order by 1