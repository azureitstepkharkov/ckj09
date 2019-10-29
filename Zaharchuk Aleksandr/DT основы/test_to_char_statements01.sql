SET SERVEROUTPUT ON

BEGIN

	-- Function  ADD_MONTHS() --
	DBMS_OUTPUT.put_line('46*-> '||ADD_MONTHS('09-02-2000', 5));

	-- Function  ADD_MONTHS() --
	DBMS_OUTPUT.put_line('47*-> '||ADD_MONTHS('27-06-2017', 3));

	-- Function  ADD_MONTHS() --
	DBMS_OUTPUT.put_line('48*-> '||ADD_MONTHS('12-02-1981', 2));

	-- Function  LAST_DAY() --
	DBMS_OUTPUT.put_line('49*-> '||LAST_DAY('27-06-2017')||' '||LAST_DAY('27-07-2017'));

	-- Function  LAST_DAY() --
	DBMS_OUTPUT.put_line('50*-> '||LAST_DAY('05-03-2002'));

	-- Function  MONTHS_BETWEEN() --
	DBMS_OUTPUT.put_line('51*-> '||MONTHS_BETWEEN('16-04-1973', '16-03-1997'));

	-- Function  MONTHS_BETWEEN() --
	DBMS_OUTPUT.put_line('52*-> '||MONTHS_BETWEEN('18-04-1972', '23-03-1961'));

	-- Function  NEW_TIME() --
	DBMS_OUTPUT.put_line( '53*-> '||TO_CHAR(NEW_TIME(TO_DATE('12-04-1971 12:00:00', 'DD-MM-YYYY HH24:MI:SS'),
		'PST', 'EST'), 'DD-MON-YYYY HH24:MI:SS')||': Pacific -> Eastern' );

	-- Function  NEXT_DAY() --
	DBMS_OUTPUT.put_line( '54*-> '||NEXT_DAY('07-04-2003', 'Понедельник'));

	-- Function  NEXT_DAY() --
	DBMS_OUTPUT.put_line( '55*-> '||NEXT_DAY('01-03-1998', 'Четверг'));
  
END;
