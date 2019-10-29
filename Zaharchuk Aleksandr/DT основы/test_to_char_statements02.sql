begin
	-- Function  ADD_MONTHS() --
	DBMS_OUTPUT.put_line('1*-> '||ADD_MONTHS('27-06-2017', 3));
	-- Function  LAST_DAY() --
	DBMS_OUTPUT.put_line('2*-> '||LAST_DAY('27-06-2017')||' '||LAST_DAY('27-02-2016'));
  	-- Function  MONTHS_BETWEEN() --
	DBMS_OUTPUT.put_line('3*-> '||MONTHS_BETWEEN('16-04-2017', '16-03-2018'));
  	-- Function  NEXT_DAY() --
	DBMS_OUTPUT.put_line( '4*-> '||NEXT_DAY('20-06-2017', 'Понедельник'));
end;