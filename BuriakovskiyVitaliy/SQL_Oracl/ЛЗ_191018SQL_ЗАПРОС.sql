SELECT 

DEP.DEPARTMENT_NAME ,
DEP.DEPARTMENT_ID ,


LOC.CITY,
LOC.STREET_ADDRESS

FROM 
HR.DEPARTMENTS DEP
LEFT JOIN HR.LOCATIONS LOC ON DEP.LOCATION_ID = LOC.LOCATION_ID