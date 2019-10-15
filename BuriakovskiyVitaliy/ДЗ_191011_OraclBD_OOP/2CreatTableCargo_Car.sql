CREATE TABLE BVN.CARGO_CAR 
(
  ID NUMBER NOT NULL 
, CAR_ID NUMBER NOT NULL 
, CARRYING INTEGER NOT NULL 
, BODY_VOLUME INTEGER NOT NULL 
);

COMMENT ON COLUMN BVN.CARGO_CAR.CARRYING IS 'Weight carried';

COMMENT ON COLUMN BVN.CARGO_CAR.BODY_VOLUME IS 'Transported volume';
