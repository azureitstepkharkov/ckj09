SET SERVEROUTPUT ON
DECLARE
  I INTEGER := 0;
  ODDSUM INTEGER := 0;
  EVENSUM INTEGER :=0;
BEGIN
  WHILE (I <= 50) LOOP
  BEGIN
      IF (mod (I, 2) = 0)THEN
        BEGIN
          EVENSUM := EVENSUM + I; 
        END;
      ELSE
        BEGIN
          ODDSUM := ODDSUM +I;
        END;
      END IF;
    I := I+1;
  END; 
  END LOOP;
  DBMS_OUTPUT.put_line('Сумма четных = ' || TO_CHAR(EVENSUM));
  DBMS_OUTPUT.put_line('Сумма нечетных = ' || TO_CHAR(ODDSUM));
END;