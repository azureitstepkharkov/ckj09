SET SERVEROUTPUT ON
DECLARE 
  I INTEGER := 0;
  SUMMA INTEGER := 0;
BEGIN
  WHILE(I <= 50) LOOP
  DBMS_OUTPUT.PUT_LINE('i = '|| TO_CHAR(I));
  I := i + 1;
  SUMMA := SUMMA+I;
  END LOOP;
  DBMS_OUTPUT.PUT_LINE('���������');
  DBMS_OUTPUT.PUT_LINE('S '|| TO_CHAR(SUMMA));
END;