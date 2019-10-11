SET SERVEROUTPUT ON
DECLARE
    I INTEGER:=0;
BEGIN
  WHILE (I<=10) LOOP
    BEGIN
      IF (mod(I,2)=0) then
      BEGIN
        DBMS_OUTPUT.PUT.INLINE(TO_CHAR(I)||'-÷åòíîå');
      END;
      
      ELSE DECLARE STR VARCHAR (11):='- ÍÅ×ÅÒÍÎÅ';
        BEGIN
        DBMS_OUTPUT.PUT_LINE(TO_CHAR(i)||STR);
      END;
    END IF;
  I:=I+10;
END LOOP;

END;