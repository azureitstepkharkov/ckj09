create or replace FUNCTION    TASK2_8_UPDATE_AUTORS
( ID_F IN  NUMBER
, FULL_NAME_F IN VARCHAR2 
, ALIAS_F IN VARCHAR2 
, B_YEAR_F IN NUMBER 
, PHONE_F IN VARCHAR2 
, EMAIL_F IN VARCHAR2 
) RETURN NUMBER IS 
I INTEGER;
BEGIN

UPDATE HR.AUTHORS  SET  FULL_NAME = FULL_NAME_F, B_YEAR=B_YEAR_F, PHONE =PHONE_F, EMAIL=EMAIL_F WHERE ID=ID_F ;
  RETURN I;
END TASK2_8_UPDATE_AUTORS;