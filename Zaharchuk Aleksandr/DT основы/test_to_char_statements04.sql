SET SERVEROUTPUT ON

BEGIN

	DBMS_OUTPUT.enable;
	-- Function CHR() --
	DBMS_OUTPUT.put_line('1*->'||CHR(37)||' '||CHR(38)||' '||CHR(101)||' '||CHR(105));

	-- Function CONCAT() --
	DBMS_OUTPUT.put_line('2*->'||CONCAT('Tom', 'Rider'));

	-- Function INITCAP() --
	DBMS_OUTPUT.put_line('3*->'||INITCAP('iF yoU or mY scoRE and 7 YEARS ago ...'));

	-- Function LOWER() --
	DBMS_OUTPUT.put_line('4*->'||LOWER('iF yoU or mY scoRE and 7 YEARS ago ...'));

	-- Function LPAD() 1 --
	DBMS_OUTPUT.put_line('5*->'||LPAD('Short String', 20, 'XY'));

	-- Function LPAD() 2 --
	DBMS_OUTPUT.put_line('6*->'||LPAD('Short String', 13, 'PD'));

	-- Function LTRIM() 1 --
	DBMS_OUTPUT.put_line('7*->'||LTRIM('     The White House has a many tree!'));

	-- Function LTRIM() 2 --
	DBMS_OUTPUT.put_line('8*->'||LTRIM('xxxxxThe White House has a many tree!', 'x'));

	-- Function LTRIM() 3 --
	DBMS_OUTPUT.put_line('9*->'||LTRIM('xyxyxyxyxyThe White House has a many tree!', 'xy'));

	-- Function LTRIM() 4 --
	DBMS_OUTPUT.put_line('10*->'||LTRIM('xyxyxxxxxyThe White House has a many tree!', 'xy'));

	-- Function REPLACE() 1 --
	DBMS_OUTPUT.put_line('11*->'||REPLACE('This and That', 'Th', 'B'));

	-- Function REPLACE() 2 --
	DBMS_OUTPUT.put_line('12*->'||REPLACE('This and That', 'Th'));

	-- Function REPLACE() 3 --
	DBMS_OUTPUT.put_line('13*->'||REPLACE('This and That', NULL));
	
END;
