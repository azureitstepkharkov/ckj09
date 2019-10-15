SET SERVEROUTPUT ON
DECLARE
  I INTEGER := 0;
  CHETSUM INTEGER :=0;
  NECETSUM INTEGER := 0;
  
BEGIN
  WHILE (I <= 50) LOOP
  BEGIN
      IF (mod (I,2) = 0)THEN
        BEGIN
          CHETSUM := CHETSUM + I; 
        END;
      ELSE
        BEGIN
          NECETSUM := NECETSUM +I;
        END;
      END IF;
    I := I+1;
  END; 
  END LOOP;
  DBMS_OUTPUT.put_line('cумма четных = ' || TO_CHAR(CHETSUM)||'   cумма нечетных = ' || TO_CHAR(NECETSUM));
 
END;