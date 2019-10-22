CREATE TABLE ORGANIZATIONS (
    ID             INTEGER      PRIMARY KEY AUTOINCREMENT   NOT NULL,
    NAME           VARCHAR      NOT NULL,
    PHONE_NUMBER   VARCHAR (20) NOT NULL,
    ADRESS         VARCHAR      NOT NULL,
    REGION         VARCHAR      NOT NULL,
    COUNTRY        VARCHAR      NOT NULL,
    CITY           VARCHAR      NOT NULL,
    ACTIVE         BOOLEAN      NOT NULL,
    SPECIALIZATION VARCHAR      NOT NULL
);

CREATE TABLE DEPARTMENTS (
    ID   INTEGER PRIMARY KEY AUTOINCREMENT
                 NOT NULL,
    NAME VARCHAR NOT NULL
);


CREATE TABLE EMPLOYEES (
    ID              INTEGER PRIMARY KEY AUTOINCREMENT
                            NOT NULL,
    FIRST_NAME      VARCHAR NOT NULL,
    LAST_NAME       VARCHAR NOT NULL,
    START_DATE      DATE    NOT NULL,
    ORGANIZATION_ID BIGINT  NOT NULL
                            REFERENCES ORGANIZATIONS (ID),
    DEPARTMENT_ID   BIGINT  NOT NULL
                            REFERENCES DEPARTMENTS (ID) 
);


INSERT INTO DEPARTMENTS
(NAME)
VALUES
('service department'),
('management department'),
('production and quality assurance departments'),
('finance department'),
('information technology department');

insert into organizations (name, phone_number, adress, region, country, city, active, specialization)

values 
('IBM','+15553552345','3039 East Cornwallis RoadRTP, NC 27709','AMERICA','USA','Armonk', 1 ,'IT'),
('Apple','+15553667890','10600 North Tantau Avenue','AMERICA','USA','Cupertino',1,'IT');

INSERT INTO EMPLOYEES
(FIRST_NAME, LAST_NAME, START_DATE, ORGANIZATION_ID, DEPARTMENT_ID)
VALUES
('TestName2','TestName2','2018-03-23',1,2),
('TestName3','TestName3','2017-17-13',1,3),
('TestName4','TestName4','2016-10-23',1,4),
('TestName5','TestName5','2015-09-23',1,5),
('TestName6','TestName6','2014-08-23',2,1),
('TestName7','TestName7','2013-07-23',2,2),
('TestName8','TestName8','2012-06-23',2,3),
('TestName9','TestName9','2011-05-23',2,4),
('TestName10','TestName10','2011-04-23',2,5),
('TestName11','TestName11','2014-03-23',1,2);
