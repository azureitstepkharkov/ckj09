CREATE TABLE BVN.PASSENGER_CAR 
(
  ID NUMBER NOT NULL 
, CAR_ID NUMBER NOT NULL 
, AIRBAG_COUNT INTEGER NOT NULL 
, RAISED_ROOF_MECHANISM CHAR(1) DEFAULT 'N' 
);
