SET SERVEROUTPUT ON;
DECLARE
A INTEGER;
B INTEGER:=7;
S INTEGER;

BEGIN
  DBMS_OUTPUT.PUT_LINE('������, ���!');  
  A:=3;
  S:=A+B;
  SYS.DBMS_OUTPUT.PUT_LINE('����� = ' || TO_CHAR(S));

END;