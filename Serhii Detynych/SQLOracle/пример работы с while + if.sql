SET SERVEROUTPUT ON
DECLARE
  I INTEGER := 0;
  
BEGIN
  WHILE (I <= 10) LOOP
  BEGIN
      IF (mod (I, 2) = 0)THEN
        BEGIN
          DBMS_OUTPUT.put_line(TO_CHAR(I) || '-  четное');
        END;
          ELSE
          DECLARE
          STR VARCHAR(17) := '-нечетное';
            BEGIN
              DBMS_OUTPUT.put_line(TO_CHAR(I) || STR);
            END;
      END IF;
    I := I+1;
    END; 
  END LOOP;
END;