SET SERVEROUTPUT ON
DECLARE
  I        INTEGER :=0;
  COUNTING INTEGER :=0;
BEGIN   --синтаксис паскаля
  WHILE (I<=10)
  LOOP
    BEGIN
      IF (MOD(I,2)=0)THEN  --(MOD(I,2)<>0) -  <> не равно, а = - равно
        BEGIN
          DBMS_OUTPUT.PUT_LINE(TO_CHAR(I)||'-ЧЕТНОЕ');
        END;
      ELSE
        DECLARE
          STR VARCHAR(17):='-НЕЧЕТНОЕ'; --Позволяет вносить переменные в середину программы
        BEGIN
          DBMS_OUTPUT.PUT_LINE(TO_CHAR(I)||STR);
        END;
      END IF;
      I:=I+1;
    END;
  END LOOP;
END;
