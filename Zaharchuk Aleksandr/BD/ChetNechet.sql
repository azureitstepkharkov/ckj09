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
  DBMS_OUTPUT.put_line('c���� ������ = ' || TO_CHAR(CHETSUM)||'   c���� �������� = ' || TO_CHAR(NECETSUM));
 
END;