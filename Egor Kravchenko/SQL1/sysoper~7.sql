SET SERVEROUTPUT ON
DECLARE 
  I INTEGER := 0;
BEGIN
  WHILE(I <= 10) LOOP
    BEGIN
      IF(mod(I,2)=0) then
        BEGIN   DBMS_OUTPUT.PUT_LINE(TO_CHAR(I)|| '- вермне ');
        END;
        ELSE 
          DECLARE STR VARCHAR(10):='123456789';
          BEGIN DBMS_OUTPUT.PUT_LINE(TO_CHAR(I)|| STR);
          END;
      END IF;
   I := I+10;
   END;
   END LOOP;
  
END;