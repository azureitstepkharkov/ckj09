SET SERVEROUTPUT ON
DECLARE
  I INTEGER := 0;
  
BEGIN
  WHILE (I <= 10) LOOP
  BEGIN
      IF (mod (I, 2) = 0)THEN
        BEGIN
          DBMS_OUTPUT.put_line(TO_CHAR(I) || '-  ������');
        END;
          ELSE
          DECLARE
          STR VARCHAR(17) := '-��������';
            BEGIN
              DBMS_OUTPUT.put_line(TO_CHAR(I) || STR);
            END;
      END IF;
    I := I+1;
    END; 
  END LOOP;
END;