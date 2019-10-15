/*
INSERT INTO BVN.ACCUMULATOR
(ID,SECTION_ID,TYPE)
VALUES (BVN.ACCUMULATOR_SEQ.NEXTVAL, -1, 'lIoN');
*/
INSERT INTO BVN.CAR
  (ID, DRIVER_IN_CAR, CAR_STARTED, ACCUMULATOR_ID)
  VALUES (BVN.CAR_SEQ.NEXTVAL, 'Y', 'Y', 2 );
  
INSERT INTO BVN.CARGO_CAR
(ID,CAR_ID,CARRYING,BODY_VOLUME)
VALUES(BVN.CARGO_CAR_SEQ.NEXTVAL, 2, 25000, 400);