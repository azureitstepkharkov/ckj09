SELECT DPR.DEPARTMENT_NAME AS ��������
  , DPR.DEPARTMENT_ID AS ID
  , LCT.STATE_PROVINCE AS ��������������
  , LCT.CITY AS �����
  , LCT.STREET_ADDRESS AS �����
FROM HR.DEPARTMENTS DPR
LEFT JOIN HR.LOCATIONS LCT ON DPR.LOCATION_ID = LCT.LOCATION_ID