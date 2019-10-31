create or replace FUNCTION    TASK2_6_INSERT_AUTOR 
( FULL_NAME IN VARCHAR2 
, ALIAS IN VARCHAR2 
, B_YEAR IN NUMBER 
, PHONE IN VARCHAR2 
, EMAIL IN VARCHAR2 
) RETURN NUMBER IS 
ID_F INTEGER;
BEGIN
INSERT INTO HR.AUTHORS ( ID, FULL_NAME , ALIAS , B_YEAR , PHONE , EMAIL )
VALUES (HR.AUTHORS_SEQ.NEXTVAL, FULL_NAME, ALIAS,B_YEAR, PHONE, EMAIL) 
RETURN ID INTO ID_F;
  RETURN ID_F;
END TASK2_6_INSERT_AUTOR;