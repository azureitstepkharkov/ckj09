CREATE TABLE BVN.CAR 
(
  ID NUMBER NOT NULL 
, DRIVER_IN_CAR CHAR(1) DEFAULT 'N' 
, CAR_STARTED CHAR(1) DEFAULT 'N' 
, ACCUMULATOR_ID NUMBER NOT NULL 
);

COMMENT ON COLUMN BVN.CAR.DRIVER_IN_CAR IS 'Driver in the car yes or no';

COMMENT ON COLUMN BVN.CAR.CAR_STARTED IS 'The car is started';
