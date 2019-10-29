
BEGIN

	-- Function  TO_CHAR() --
	DBMS_OUTPUT.put_line( TO_CHAR(534523));

	-- Function  TO_CHAR() --
	DBMS_OUTPUT.put_line( TO_CHAR(34387,  '99999'));

	-- Function  TO_CHAR() --
	DBMS_OUTPUT.put_line( TO_CHAR(5000,  '$9999'));

	-- Function  TO_CHAR() --
	DBMS_OUTPUT.put_line( TO_CHAR(-9,  '9S'));

	-- Function  TO_CHAR() --
	DBMS_OUTPUT.put_line( TO_CHAR(-34,  'S99'));

	-- Function  TO_CHAR() --
	DBMS_OUTPUT.put_line( TO_CHAR(3 - 5,  '999MI'));

	-- Function  TO_CHAR() --
	DBMS_OUTPUT.put_line( TO_CHAR(7 - 3,  'S9'));

	-- Function  TO_CHAR() --
	DBMS_OUTPUT.put_line( TO_CHAR(4 - 5,  '99PR'));

	-- Function  TO_CHAR() --
	DBMS_OUTPUT.put_line( TO_CHAR(8900,  'L9999'));

	-- Function  TO_CHAR() --
	DBMS_OUTPUT.put_line( TO_CHAR(10000000,  '9.9EEEE'));

	-- Function  TO_CHAR() --
	DBMS_OUTPUT.put_line( TO_CHAR(10,  'RM'));

	-- Function  TO_CHAR() --
	DBMS_OUTPUT.put_line( TO_CHAR(105,  'RM'));

END;
