SET SERVEROUTPUT ON

BEGIN

	-- Function  ATAN() TAN() --
	DBMS_OUTPUT.put_line('35*-> '||TO_CHAR(ATAN(0.32))||' '||TO_CHAR(TAN(-43 * 3.14159)));

	-- Function  CEIL() --
	DBMS_OUTPUT.put_line('36*-> '||TO_CHAR(CEIL(17.134))||' '||TO_CHAR(CEIL(-17.134)));

	-- Function  COS() SIN() --
	DBMS_OUTPUT.put_line('37*-> '||TO_CHAR(COS(90))||' '||TO_CHAR(SIN(60)));

	-- Function  EXP() --
	DBMS_OUTPUT.put_line('38*-> '||TO_CHAR(EXP(1))||' '||TO_CHAR(EXP(3.456)));

	-- Function  LN() LOG() --
	DBMS_OUTPUT.put_line('39*-> '||TO_CHAR(LN(100))||' '||TO_CHAR(LOG(5, 31))||' '||TO_CHAR(LOG(2, 12)));

	-- Function  MOD() --
	DBMS_OUTPUT.put_line('40*-> '||TO_CHAR(MOD(34, 8))||' '||TO_CHAR(MOD(45, 7)));
  
	-- Function  POWER() --
	DBMS_OUTPUT.put_line('41*-> '||TO_CHAR(POWER(8, 4))||' '||TO_CHAR(POWER(65, -7)));

	-- Function  ROUND() --
	DBMS_OUTPUT.put_line('42*-> '||TO_CHAR(ROUND(2.57))||' '||TO_CHAR(ROUND(3.678, 1))||' '||TO_CHAR(ROUND(14.8, -2)));

	-- Function  SIGN() --
	DBMS_OUTPUT.put_line('43*-> '||TO_CHAR(SIGN(-4))||' '||TO_CHAR(SIGN(0))||' '||TO_CHAR(SIGN(6)));

	-- Function  SQRT() --
	DBMS_OUTPUT.put_line('44*-> '||TO_CHAR(SQRT(98))||' '||TO_CHAR(SQRT(9)));

	-- Function  TRUNC() --
	DBMS_OUTPUT.put_line('45*-> '||TO_CHAR(TRUNC(-123.456))||' '||TO_CHAR(TRUNC(123.456,1))||' '||TO_CHAR(TRUNC(123.456, -1)));

  END;
