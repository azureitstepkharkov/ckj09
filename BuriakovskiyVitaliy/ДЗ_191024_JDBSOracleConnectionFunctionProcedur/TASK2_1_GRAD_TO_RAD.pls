create or replace FUNCTION    TASK2_1_GRAD_TO_RAD 
(
  GRAD IN NUMBER DEFAULT 0 
) RETURN NUMBER AS 
BEGIN
  RETURN GRAD*3.14/180;
END TASK2_1_GRAD_TO_RAD;