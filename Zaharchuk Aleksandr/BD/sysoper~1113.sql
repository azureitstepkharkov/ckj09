INSERT INTO HR.AUTHORS (ID,FULL_NAME,PHONE,B_YEAR)
VALUES (AUTHORS_SEQ.NEXTVAL,'PETROV DMITRIY', '380957201434', 1973);

RETURNING INTO 

SELECT AUTHORS_SEQ.CURRVAL FROM DUAL